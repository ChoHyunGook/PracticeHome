package com.bitstudy.web.oop.domain;

/**
 * packageName: com.bitstudy.web.oop.domain
 * fileName        : Phone
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public class Phone {
    protected  String kind;
    protected  String company;
    protected String call;

    public Phone(String kind,String company){
        this.kind=kind;
        this.company=company;
    }

    public String getKind() {
        return kind;
    }

    public String getCompany() {
        return company;
    }


    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }



    @Override
    public String toString() {
        return "집전화기{" +
                "폰종류='" + kind + '\'' +
                ", 제조사='" + company + '\'' +
                ", 기능='" + call + '\'' +
                '}';
    }
}

