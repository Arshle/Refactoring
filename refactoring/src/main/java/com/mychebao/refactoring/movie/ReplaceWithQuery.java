/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: ReplaceWithQuery.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class ReplaceWithQuery {

    private int _quantity;
    private int _itemPrice;

    double getPrice(){
        return basePrice() * discountFactor();
    }

    private int basePrice(){
        return _quantity * _itemPrice;
    }

    private double discountFactor(){
        return basePrice() > 1000 ? 0.95 : 0.98;
    }
}
