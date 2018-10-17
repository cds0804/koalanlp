[kr.bydelta.koala.proc](../index.md) / [CanTagOnlyAParagraph](./index.md)

# CanTagOnlyAParagraph

`abstract class CanTagOnlyAParagraph<S> : `[`CanTag`](../-can-tag/index.md)

문장1개는 불가하지만, 문단1개가 분석가능한 품사분석기 interface. 원본 분석기는 문장 분석 결과를 [S](index.md#S) 타입으로 돌려줌.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CanTagOnlyAParagraph()`<br>문장1개는 불가하지만, 문단1개가 분석가능한 품사분석기 interface. 원본 분석기는 문장 분석 결과를 [S](index.md#S) 타입으로 돌려줌. |

### Functions

| Name | Summary |
|---|---|
| [convertSentence](convert-sentence.md) | `abstract fun convertSentence(result: `[`S`](index.md#S)`): `[`Sentence`](../../kr.bydelta.koala.data/-sentence/index.md)<br>[S](index.md#S) 타입의 분석결과 [result](convert-sentence.md#kr.bydelta.koala.proc.CanTagOnlyAParagraph$convertSentence(kr.bydelta.koala.proc.CanTagOnlyAParagraph.S)/result)를 변환, [Sentence](../../kr.bydelta.koala.data/-sentence/index.md)를 구성함. |
| [tag](tag.md) | `fun tag(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Sentence`](../../kr.bydelta.koala.data/-sentence/index.md)`>`<br>주어진 문단 [text](tag.md#kr.bydelta.koala.proc.CanTagOnlyAParagraph$tag(kotlin.String)/text)을 분석하여 품사를 부착하고, 결과로 [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Sentence](../../kr.bydelta.koala.data/-sentence/index.md)&gt; 객체를 돌려줌. |
| [tagParagraphOriginal](tag-paragraph-original.md) | `abstract fun tagParagraphOriginal(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`S`](index.md#S)`>`<br>변환되지않은, [text](tag-paragraph-original.md#kr.bydelta.koala.proc.CanTagOnlyAParagraph$tagParagraphOriginal(kotlin.String)/text)의 분석결과 [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[S](index.md#S)&gt;를 반환. |
| [tagSentence](tag-sentence.md) | `fun tagSentence(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Sentence`](../../kr.bydelta.koala.data/-sentence/index.md)<br>주어진 문장 [text](tag-sentence.md#kr.bydelta.koala.proc.CanTagOnlyAParagraph$tagSentence(kotlin.String)/text)을 분석하여 품사를 부착하고, 결과로 [Sentence](../../kr.bydelta.koala.data/-sentence/index.md) 객체를 돌려줌. |

### Inherited Functions

| Name | Summary |
|---|---|
| [invoke](../-can-tag/invoke.md) | `open operator fun invoke(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Sentence`](../../kr.bydelta.koala.data/-sentence/index.md)`>`<br>주어진 문단 [text](../-can-tag/invoke.md#kr.bydelta.koala.proc.CanTag$invoke(kotlin.String)/text)을 분석하여 품사를 부착하고, 결과로 [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Sentence](../../kr.bydelta.koala.data/-sentence/index.md)&gt; 객체를 돌려줌. |