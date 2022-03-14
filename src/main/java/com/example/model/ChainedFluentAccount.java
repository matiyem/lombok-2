package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:21 AM
**/
//گزینه fluent به ما دسترسی هایی می دهد که پیشوند get یا set ندارند.
//
//ما در یک لحظه نگاهی به گزینه زنجیره ای خواهیم انداخت، اما از آنجایی که به طور پیش فرض فعال است، اجازه دهید فعلاً آن را به صراحت غیرفعال کنیم:

//گزینه chain به ما setter می دهد که this را برمی گرداند. مجدداً توجه داشته باشید که به طور پیش‌فرض روی true است، اما برای وضوح آن را به صراحت تنظیم می‌کنیم.
@Accessors(fluent = true,chain = true)
@Getter
@Setter
public class ChainedFluentAccount {
    private String name;
    private BigDecimal balance;
}
