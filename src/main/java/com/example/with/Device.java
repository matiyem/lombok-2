package com.example.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:31 PM
**/
@Getter
@AllArgsConstructor
public abstract class Device {
//    برای استفاده صحیح از حاشیه نویسی @With، باید یک سازنده همه آرگومان ها ارائه کنیم. همانطور که از مثال بالا می بینیم، روش تولید شده برای ایجاد یک کلون از شی اصلی به این نیاز دارد.
//
//برای برآورده کردن این نیاز می‌توانیم از حاشیه‌نویسی @AllArgsConstructor یا @Value خود Lombok استفاده کنیم. از طرف دیگر، می‌توانیم به‌طور دستی این سازنده را نیز ارائه کنیم و در عین حال اطمینان حاصل کنیم که ترتیب ویژگی‌های غیراستاتیک در کلاس با سازنده مطابقت دارد.
//
//باید به خاطر داشته باشیم که حاشیه نویسی @With اگر در فیلدهای استاتیک استفاده شود هیچ کاری نمی کند. این به این دلیل است که ویژگی های استاتیک بخشی از وضعیت یک شی در نظر گرفته نمی شود. همچنین، Lombok از تولید متد برای فیلدهایی که با علامت $ شروع می شوند، صرف نظر می کند.

    private final String serial;

    @With
    private final boolean isInspected;
}
