/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: PaymentHistory.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */

interface Nullable{
    boolean isNull();
}

public class PaymentHistory {

    int getWeeksDelinquentInLastYear(){
        return 0;
    }
}

class Site{

    private Customer _customer;

    Customer getCustomer(){
        return _customer;
    }
}



class NullCustomer extends Customer implements Nullable{

    public boolean isNull(){
        return true;
    }
}

class BillingPlan{
    static BillingPlan basic(){
        return new BillingPlan();
    }
}
