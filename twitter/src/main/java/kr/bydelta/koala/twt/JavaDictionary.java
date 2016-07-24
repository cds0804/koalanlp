package kr.bydelta.koala.twt;

import kr.bydelta.koala.POS$;

import java.util.List;

/**
 * 자바 사용자를 위한, 사용자정의사전.
 * <p>
 * POS$.Value 클래스는, POS.EC()와 같이 입력하면 생성됩니다.
 */
public class JavaDictionary {
    /**
     * 사용자 정의 사전을 입력합니다.
     *
     * @param morphs 입력할 형태소의 목록.
     * @param pos    형태소별 품사의 목록. POS.NNG(), POS.VV() 등.
     */
    public static void addUserDictionary(List<String> morphs, List<POS$.Value> pos) {
        Dictionary$.MODULE$.jUserDictionary(morphs, pos);
    }
}
