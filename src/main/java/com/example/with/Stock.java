package com.example.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:39 PM
**/
@Getter
@AllArgsConstructor
public class Stock {

    @With
    private String sku;
    private int stockCount;

    public Stock withSku(String sku) {
        return new Stock("mod-" + sku, stockCount);
    }

    public Stock withSKU(String... sku) {
        return sku == null || sku.length == 0 ?
                new Stock("unknown", stockCount) :
                new Stock("mod-" + sku[0], stockCount);
    }
}
