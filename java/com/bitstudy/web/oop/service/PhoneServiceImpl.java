package com.bitstudy.web.oop.service;

import com.bitstudy.web.oop.domain.CelPhone;
import com.bitstudy.web.oop.domain.GalPhone;
import com.bitstudy.web.oop.domain.IPhone;
import com.bitstudy.web.oop.domain.Phone;

/**
 * packageName: com.bitstudy.web.oop.service
 * fileName        : PhoneServiceImpl
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());

    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());

    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());

    }
}
