package com.bitstudy.web.oop.repository;

/**
 * packageName: com.bitstudy.web.oop.repository
 * fileName        : Test
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public class Test {
    public static void main(String[] args){
        B b=new B("폰","화이트",1);
        System.out.println(b.model);
        System.out.println(b.color);
        System.out.println(b.channel);
        b.powerOn();
        b.bell();
        b.sendVoice("하이");
        b.turnVoice("ㅇㅇ");
        b.sendVoice("ㅇㅇ ㅅㄱ");
        b.bye();
        b.onDmb();
        b.changeDmb(11);
        b.offDmb();
        System.out.println("테스트");
    }
}
