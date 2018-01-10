/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Employee.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Employee {

    private double salary;

    void tenPercentRaise(){
        salary *= 1.1;
    }

    void fivePercentRaise(){
        salary *= 1.05;
    }

    int getRate(){
        return 0;
    }
}
