package com.bitstudy.web.oop.repository;

/**
 * packageName: com.bitstudy.web.oop.repository
 * fileName        : A
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public class A {
    String model;
    String color;

    void powerOn(){
        System.out.println("전원 on");
    }
    void powerOff(){
        System.out.println("전원 off");

    }
    void bell(){
        System.out.println("따르릉");

    }
    void sendVoice(String message){
        System.out.println("본인: "+message);

    }
    void turnVoice(String message){
        System.out.println("상대방: "+message);

    }
    void bye(){
        System.out.println("전화 끊");

    }

}
