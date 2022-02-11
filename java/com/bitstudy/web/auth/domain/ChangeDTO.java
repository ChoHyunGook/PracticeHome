package com.bitstudy.web.auth.domain;

/**
 * packageName: com.bitstudy.web.domain
 * fileName        : ChangeDTO
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class ChangeDTO {
    public static String MAIN_NAME="300원 커피 자판기 거스름돈";

    private final static ChangeDTO changeDTO=new ChangeDTO();
    private  ChangeDTO(){}
    public static ChangeDTO getInstance(){return changeDTO;}

    public static int coffee =300;
    private int input=0;

    public static int getCoffee(){
        return coffee;
    }
    public void setCoffee(int coffee){
        this.coffee=coffee;
    }
    public int getInput(){
        return input;
    }
    public void setInput(int input){
        this.input=input;
}
}
