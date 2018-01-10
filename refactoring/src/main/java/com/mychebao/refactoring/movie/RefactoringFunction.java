/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: RefactoringFunction.java
 * Author:   zhangdanji
 * Date:     2017年09月09日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author zhangdanji
 */
public class RefactoringFunction {

    private String _name;
    private Vector _orders = new Vector();

    void printOwing(){
        printBanner();

        double outstanding = getOutstanding();

        printDetails(outstanding);
    }

    double getOutstanding(){
        Enumeration e = _orders.elements();
        double result = 0.0;
        while(e.hasMoreElements()){
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    void printBanner(){
        System.out.println("********************");
        System.out.println("***Customer Owes****");
        System.out.println("********************");
    }

    void printDetails(double outstanding){
        System.out.println("name:" + _name);
        System.out.println("amount:" + outstanding);
    }

    private class Order{
        private double amount;

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}
