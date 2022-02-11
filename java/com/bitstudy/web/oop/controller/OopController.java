package com.bitstudy.web.oop.controller;

import com.bitstudy.web.oop.domain.CelPhone;
import com.bitstudy.web.oop.domain.GalPhone;
import com.bitstudy.web.oop.domain.IPhone;
import com.bitstudy.web.oop.domain.Phone;
import com.bitstudy.web.oop.service.PhoneService;
import com.bitstudy.web.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : PhoneController
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class OopController {
    public void excute(Scanner scanner){
        while (true){
            //객체지향 은/상/추/다.
            System.out.println("[SUB_MENU]\n" +
                    "0.EXIT\n" +
                    "1.은닉화(Encapsulation)\n"+
                    "2.상속(Inheritance)\n"+
                    "3.추상화(Abstraction)\n"+
                    "4.다형성(Polymorphism)");
            //객체지향 하나의 모듈 내에서 1회이상 반드시 사용한다.
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println("POJO가 은닉화다.");
                    break;
                case "2":
                    System.out.println("extends 가 상속이다.");
                    Phone phone=new Phone("금성전화기","금성");
                    CelPhone celPhone=new CelPhone("효리폰","LG","이동중에");
                    IPhone iPhone=new IPhone("애플");
                    GalPhone galPhone=new GalPhone("삼성");
                    PhoneService service=new PhoneServiceImpl();
                    System.out.println("[소메뉴] 0. EXIT 1.집전화 2.핸드폰 3.아이폰 4.겔럭시");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("EXIT");
                                return;
                            case "1":
                                System.out.println("##집전화##");
                                phone.setCall("하이");
                                service.usePhone(phone);
                                break;
                            case "2":
                                System.out.println("##핸드폰##");
                                celPhone.setCall("하이요");
                                service.useCelPhone(celPhone);
                                break;
                            case "3":
                                System.out.println("##아이폰##");
                                iPhone.setSearch("뉴스");
                                service.useIPhone(iPhone);
                                break;
                            case "4":
                                System.out.println("##겔럭시##");
                                galPhone.setPay("삼성페이");
                                service.useGalPhone(galPhone);
                                break;
                            default:
                                System.out.println("올바른 번호를 입력하세요");
                                break;

                        }break;
                case "3":
                    System.out.println("임플리먼트 추상화이다.");;break;
                case "4":
                    System.out.println("타입의 변경이 다형성이다.");;break;
                default:
                    System.out.println("정확한 메뉴명을 입력해주세요.");;break;
            }
        }
    }
}
