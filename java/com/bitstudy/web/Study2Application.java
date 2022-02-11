package com.bitstudy.web;

import com.bitstudy.web.algorithm.controller.AlgoController;
import com.bitstudy.web.oop.controller.OopController;
import com.bitstudy.web.auth.controller.AuthController;
import com.bitstudy.web.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Study2Application {

    public static void main(String[] args) {
        AuthController authController=new AuthController();
        AlgoController algoController=new AlgoController();
        QuizController quizController=new QuizController();
        OopController phoneController=new OopController();
        SpringApplication.run(Study2Application.class, args);
        Scanner scanner=new Scanner(System.in);



        while (true){
            System.out.println("[MAIN_MENU]\n 0.EXIT\n1.AUTH\n2.ALGORITHM\n3.QUIZ\n4.OOP");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    authController.excute(scanner);break;
                case "2":
                    algoController.excute(scanner);break;
                case "3":
                    quizController.excute(scanner);break;
                case "4":
                    phoneController.excute(scanner);break;
                default:
                    System.out.println("올바른 메뉴를 입력하세요.");break;
            }
        }
    }

}
