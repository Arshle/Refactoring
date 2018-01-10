/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Account.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Account {

    private AccountType _type;
    private int _daysOverdrawn;

    int gamma(int inputVal,int quantity,int yearToDate){
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta(){
        return 1;
    }

    double bankCharge(){
        double result = 4.5;
        if(_daysOverdrawn > 0){
            result += _type.overdraftCharge(_daysOverdrawn);
        }
        return result;
    }

    double inserestForAmount_days(double amount,int days){
        return _type.getInterestRate() * amount * days / 365;
    }

}

class AccountType{
    private int isPremium = 0;
    private double _inserestRate;

    void setInterestRate(double arg){
        _inserestRate = arg;
    }

    double getInterestRate(){
        return _inserestRate;
    }

    boolean isPremium(){
        return isPremium == 0 ? false : true;
    }

    double overdraftCharge(int daysOverdrawn){
        if(isPremium()){
            double result = 10;
            if(daysOverdrawn > 7){
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        }else{
            return daysOverdrawn * 1.75;
        }
    }
}

class Gamma{

    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma(Account source,int inputValArg,int quantityArg,int yearToDateArg){
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    int compute(){
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;

        importantThing();

        int importantValue3 = importantValue2 * 7;

        return importantValue3 - 2 * importantValue1;
    }

    void importantThing(){
        if((yearToDate - importantValue1) > 100){
            importantValue2 -= 20;
        }
    }
}
