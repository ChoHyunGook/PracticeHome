package com.bitstudy.web.auth.service;

import com.bitstudy.web.auth.domain.*;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : StudentService
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public interface MemberService {
    String getBmi(BmiCalcDTO bmi);
    String getChange(ChangeDTO change);
    String getCircleArea(CircleAreaDTO circleArea);
    String getCalc(CalcDTO calc);
    String getGrade(GradeDTO grade);
    String getLogin(UserDTO login);
    String getSearch(SearchDTO search);
    String getWeekSalary(WeeklySalaryDTO weeklySalary);

}
