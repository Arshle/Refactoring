/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Param.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Param {
    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println("x after triple: " + x);
    }

    private static void triple(int arg){
        arg = arg * 3;
        System.out.println("arg in triple: " + arg);
    }
}
