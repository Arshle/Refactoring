/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: RemoveAssignments.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class RemoveAssignments {
    int discount(final int inputVal,final int quantity, final int yearToDate){
        int result = inputVal;
        if(inputVal > 50){
            result -= 2;
        }
        if(quantity > 100){
            result -= 1;
        }
        if(yearToDate > 10000){
            result -= 4;
        }
        return result;
    }
}
