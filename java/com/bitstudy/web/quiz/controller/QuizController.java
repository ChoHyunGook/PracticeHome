package com.bitstudy.web.quiz.controller;

import com.bitstudy.web.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.quiz.controller
 * fileName        : QuizController
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class QuizController {
    public void excute(Scanner scanner){
        Feb06Service service06= new Feb06ServiceImpl();
        Feb07Service service07= new Feb07ServiceImpl();
        Feb08Service service08= new Feb08ServiceImpl();
        String res ="";
        while (true){
            System.out.println("[SUB_MENU]\n0.EXIT\n1.2월6일\n2.2월7일\n3.2월8일\n4.2월9일");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                            "정렬", "해시", "힙", "완전탐색", "DP",
                            "스택", "깊이우선탐색 ", "그래프", "탐욕법", "이분탐색",
                            "큐", "너비우선탐색"};

                    while (true) {
                        System.out.println("소메뉴\n" +
                                " 1. 팀별과제 출력\n" +
                                "2. 팀장이 맡은 과제만 출력\n" +
                                "3.담당한 과목 선택하면 담당한사람 출력\n" +
                                "4. 팀원별 과제수 출력\n" +
                                " 5.정렬\n" +
                                " 0. EXIT");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":
                                service06.quiz1(arr);
                                break;
                            case "2":
                                service06.quiz2(arr);
                                break;
                            case "3":
                                service06.quiz3(scanner, arr);
                                break;
                            case "4":
                                service06.quiz4(arr);
                                break;
                            case "5":
                                service06.algorism(arr);
                                break;
                            default:
                                res = "정확한 메뉴명을 입력해주세요.";
                                break;

                        }
                        System.out.println(res);break;

                    }

                case "2":
                    while (true) {
                        System.out.println("소메뉴\n" +
                                " 0.EXIT\n " +
                                "1.주사위(Dice)\n " +
                                "2.가위바위보(Rps)\n " +
                                "3.입력받은 두수 사이의 소수구하기(getPrime)\n" +
                                "4.자바로 입력받은 년도가 윤년인지 평년인지 판단하기(leap Year)\n" +
                                "5.임의로 입력받은 숫자 맞추기(numberGolf)");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("시스템종료");
                                return;
                            case "1":
                                service07.dice();
                                break;
                            case "2":
                                service07.rps(scanner);
                                break;
                            case "3":
                                service07.getPrime(scanner);
                                break;
                            case "4":
                                service07.leapYear(scanner);
                                break;
                            case "5":
                                service07.numberGolf(scanner);
                                break;
                            default:
                                System.out.println("정확한 메뉴를 선택하세요.");;
                                break;

                        }

                    }
                    case "3":
                        while (true) {
                            System.out.println("소메뉴\n" +
                                    " 0.EXIT\n " +
                                    "1.구구단\n " +
                                    "2.야구\n " +
                                    "3.로또\n" +
                                    "4.은행\n" +
                                    "5.예약");
                            switch (scanner.next()) {
                                case "0":
                                    System.out.println("시스템종료");
                                    return;
                                case "1":
                                    service08.quiz1(scanner);
                                    break;
                                case "2":
                                    service08.quiz2(scanner);
                                    break;
                                case "3":
                                    service08.quiz3();
                                    break;
                                case "4":
                                    service08.quiz4(scanner);
                                    break;
                                case "5":
                                    service08.quiz5(scanner);
                                    break;
                                default:
                                    System.out.println("정확한 메뉴를 선택하세요.");
                                    break;
                            }
                        }
                    case "4":

                        break;

                    default:
                    System.out.println("올바른 메뉴를 선택하세요.");break;
            }
        }
    }
}
