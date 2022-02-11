package com.bitstudy.web.studyinfo;

/**
 * packageName: com.bitstudy.web.studyinfo
 * fileName        : Info11Day
 * author           : chohyungook
 * date               : 2022-02-10
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         chohyungook        최초 생성
 */
public class Info11Day{
    //inheritance=서로 characteistics를 share하는 것
    //constant=변하지않는 주소이다.(전프로그램에서)
    //variable=주소가 변하는것
    //immutable=주소값이 변하지않는것
    //mutable=주소값이 변하는것
    //
    //타입(T) 주소(R) =값(V);
    //String s ="";
    //
    //싱글톤
    //
    //
    //
    //
    //
    private final static Info10Day info10=new Info10Day();
    private void Info10Day(){}
    public static Info10Day getInstance(){return info10;}

}
