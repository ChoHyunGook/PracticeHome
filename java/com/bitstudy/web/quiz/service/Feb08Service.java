package com.bitstudy.web.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.quiz.service
 * fileName        : Feb08Service
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :권혜민 : 구구단
 * 김한슬 : 야구
 * 김진영 : 로또
 * 조현국 : 은행(bank)
 * 서성민 : 예약(book)
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public interface Feb08Service {
    void gugudan(Scanner scanner);
    void baseball(Scanner scanner);
    String lotto();
    void bank(Scanner scanner);
    void book(Scanner scanner);
}
