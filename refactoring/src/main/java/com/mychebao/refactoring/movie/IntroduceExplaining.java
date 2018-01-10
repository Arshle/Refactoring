/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IntroduceExplaining.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class IntroduceExplaining {

    private int _quantity;
    private int _itemPrice;

    double price(){
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice(){
        return _quantity * _itemPrice;
    }

    private double quantityDiscount(){
        return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
    }

    private double shipping(){
        return Math.min(basePrice() * 0.1, 100);
    }
}
