package com.bitstudy.web.oop.service;

import com.bitstudy.web.oop.domain.CelPhone;
import com.bitstudy.web.oop.domain.GalPhone;
import com.bitstudy.web.oop.domain.IPhone;
import com.bitstudy.web.oop.domain.Phone;

/**
 * packageName: com.bitstudy.web.oop.service
 * fileName        : PhoneService
 * author           : chohyungook
 * date               : 2022-02-09
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         chohyungook        최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
