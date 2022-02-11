package com.bitstudy.web.oop.domain;

import com.bitstudy.web.auth.domain.CalcDTO;

/**
 * packageName: com.bitstudy.web.oop.domain
 * fileName        : IPhone
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 *아이폰은 검색(search) 속성이 추가된다.
 * 잡스는 아이폰을 휴대폰으로 불리는것을 거부했다. KIND 는 아이폰이다.
 */
public class IPhone extends CelPhone {
    public final static String KIND="아이폰";
    protected String search;


    public IPhone(String company){
        super(KIND,company,"이동중");

    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }


    @Override
    public String toString() {
        return String.format(
                "%s에서 만든 %s를 사용해서 %s중에 %s를 검색한다."
                ,super.getCompany(),KIND,super.getMove(),search);
    }
}
