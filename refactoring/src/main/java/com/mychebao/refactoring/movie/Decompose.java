/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Decompose.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.Date;

/**
 * @author zhangdanji
 */
public class Decompose {

    private Date SUMMER_START;
    private Date SUMMER_END;
    private double charge;
    private int quantity;
    private int _winterRate;
    private int _winterServiceCharge;
    private int _summerRate;

    void countCharge(Date date){
        if(notSummer(date)){
            charge = summerCharge(quantity);
        }else{
            charge = winterCharge(quantity);
        }
    }

    private boolean notSummer(Date date){
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private double summerCharge(int quantity){
        return quantity * _summerRate;
    }

    private double winterCharge(int quantity){
        return quantity * _winterRate + _winterServiceCharge;
    }
}
