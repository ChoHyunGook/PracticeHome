package com.bitstudy.web.oop.repository;

/**
 * packageName: com.bitstudy.web.oop.repository
 * fileName        : B
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public class B extends A{

    int channel;


    B(String model,String color,int channel){
        this.model=model;
        this.color=color;
        this.channel=channel;
    }
    void onDmb(){
        System.out.println(channel+"번 수신시작");

    }
    void changeDmb(int channel){
        this.channel=channel;
        System.out.println(channel+"변경");

    }
    void offDmb(){
        System.out.println("dmb off");

    }
}
