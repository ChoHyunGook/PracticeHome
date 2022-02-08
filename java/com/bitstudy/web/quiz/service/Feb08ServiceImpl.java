package com.bitstudy.web.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.quiz.service
 * fileName        : Feb08ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void quiz1() {
        int i, dan;
        for (dan = 2; dan <= 9; dan++) {
            System.out.print("[" + dan + "단]\t");
        }
        System.out.println();
        for (i = 1; i <= 9; i++) {
            for (dan = 2; dan <= 9; dan++) {
                System.out.print(dan + "*" + i + "=" + i * dan + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public void quiz2() {

    }

    @Override
    public void quiz3() {

    }

    @Override
    public void quiz4(Scanner scanner) {
        //       <조건>
//
//        1. 프로그램에는 네 가지 메뉴가 포함된다. (잔액조회,인출,입금,종료)
//
//        2. 인출금액은 잔액보다 클 수 없다.
//
//        3. 사용자가 종료를 원할 때까지 반복 실행한다.
//
//        4. 예금이 인출 된 후에는 인출된 만큼 잔액이 감소해야 한다.


        int total = 200000;//잔액
        int output = 0;//출금
        int input = 0;//입금
        int m = 10000;
        int m5 = 50000;
        int m10 = 100000;
        int m20= 200000;
        int m50 = 500000;
        while (true) {
            System.out.println("사용하실 메뉴를 선택해주세요.\n" +
                    "0.잔액조회 1.현금인출 2.입금 3.종료");
            int menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println(String.format("고객님의 잔액은 %d입니다.", total));
                    break;
                case 1:
                    System.out.println("인출하실 금액을 선택하세요." +
                            "0. 만원 1. 5만원 2. 10만원 3.20만원 4.50만원 5.직접입력");
                    switch (scanner.nextInt()) {
                        case 0:
                            if(total>=m) {
                                total = total - m;
                                System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m, total));
                            }else if(total<m){
                                System.out.println("잔액이 부족합니다.");
                            }
                            break;
                        case 1:
                            if(total>=m5) {
                                total = total - m5;
                                System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m5, total));
                            }else if(total<m5){
                                System.out.println("잔액이 부족합니다.");
                            }
                            break;
                        case 2:
                            if(total>=m10) {
                                total = total - m10;
                                System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m10, total));
                            }else if (total<m10){
                                System.out.println("잔액이 부족합니다.");
                            }
                            break;
                        case 3:
                            if(total>=m20){
                                total=total-m20;
                                System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.",m20,total));
                            }else if(total<m20) {
                                System.out.println("잔액이 부족합니다. 다시입력해주세요.");
                            }
                            break;
                        case 4:
                            if(total>=m50){
                                total=total-m50;
                                System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.",m50,total));
                            }else if(total<m50) {
                                System.out.println("잔액이 부족합니다. 다시입력해주세요.");
                            }
                            break;
                        case 5:
                            System.out.println("인출금액을 입력해주세요.");
                            output = scanner.nextInt();
                            if (total < output) {
                                System.out.println("잔액이 부족합니다.");
                            }else if (total>=output) {
                                    total=total-output;
                                    System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", output, total));
                                }
                            break;
                        default:
                            System.out.println("올바른 번호를 입력해주세요.");
                            break;

                }
                break;
                case 2:
                    System.out.println("입금하실 금액을 입력하세요.");
                    input = scanner.nextInt();
                    total=total+input;
                    System.out.println(String.format("입금하신금액은 %d이며 잔액은 %d입니다.", input, total));
                    break;

                case 3:
                    System.out.println("EXIT");
                    return;

            }
        }
    }



    @Override
    public void quiz5(Scanner scanner) {
        // 1. 배열을 이용하여 간단한 극장 예약시스템 작성
        // 2. 아주 작은 극장이라 좌석이 10개만  됨.
        // 3. 먼저 좌석 배치표를 보여주고 예약이 끝나면 1로
        // 4. 예약이 안된 좌석은 0으로 나타내라.

        int seat[] = new int[10];
        int rserved;

        while (true){
            System.out.println("좌석을 예약하시겠습니까? (1또는 0)");
            int q = scanner.nextInt();

            if (q == 0) break;
            System.out.println("현재의 예약상태는 다음과 같습니다.");
            System.out.println("===");
            for(int i=0; i<10; i++){
                System.out.println(i +1 + "");
            }
            System.out.println();
            for (int i : seat)
                System.out.println(i + "");
            System.out.println();
            System.out.println("몇 번째 좌석을 에약하시겠습니까?");
            rserved = scanner.nextInt();
            seat[rserved-1] = 1;
            System.out.println("예약되었습니다.");
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();


    }


}
