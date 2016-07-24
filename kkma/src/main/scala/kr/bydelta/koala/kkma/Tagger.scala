package kr.bydelta.koala.kkma

/**
  * Created by bydelta on 16. 7. 21.
  */

import kr.bydelta.koala
import kr.bydelta.koala.Processor
import kr.bydelta.koala.data.Word
import kr.bydelta.koala.traits.CanTag
import org.snu.ids.ha.ma._

import scala.collection.JavaConversions._

/**
  * 꼬꼬마 형태소분석기.
  */
final class Tagger extends CanTag[Sentence] {
  /** 꼬꼬마 형태소분석기 객체. **/
  private lazy val ma = {
    val ma = new MorphemeAnalyzer
    ma.createLogger(null)
    Dictionary.reloadDic()
    ma
  }

  override def tagSentence(text: String): koala.data.Sentence = convert(tagParagraphRaw(text).head)

  override private[koala] def convert(result: Sentence): koala.data.Sentence =
    new koala.data.Sentence(
      words =
        result.map {
          eojeol =>
            new Word(
              surface = eojeol.getExp,
              morphemes = eojeol.map {
                morph => new koala.data.Morpheme(
                  surface = morph.getString,
                  rawTag = morph.getTag,
                  processor = Processor.KKMA
                )
              }
            )
        }
    )

  /**
    * 변환되지않은, 분석결과를 반환.
    *
    * @param text 분석할 String.
    * @return 원본 문장객체.
    */
  def tagParagraphRaw(text: String): Seq[Sentence] =
    ma.divideToSentences(
      ma.leaveJustBest(
        ma.postProcess(
          ma.analyze(
            text.replaceAll("\\s*([^ㄱ-힣0-9A-Za-z,\\.!\\?\'\"]+)\\s*", " $1 ")
          )
        )
      )
    ).toSeq

  override def tagParagraph(text: String): Seq[koala.data.Sentence] = tagParagraphRaw(text).map(convert)

  /**
    * 꼬꼬마는 문장단위의 분석결과가 없습니다.
    *
    * @param text 분석할 String.
    * @return 원본 문장객체.
    */
  @deprecated
  override def tagSentenceRaw(text: String): Sentence = null

  @throws[Throwable]
  override protected def finalize() {
    ma.closeLogger()
    super.finalize()
  }
}

