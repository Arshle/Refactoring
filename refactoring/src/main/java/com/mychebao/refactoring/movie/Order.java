/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Order.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author zhangdanji
 */
public class Order {

    private CustomerC _customer;

    public Order(String customerName){
        _customer = CustomerC.create(customerName);
    }

    public String getCustomerName(){
        return _customer.getName();
    }

    public static int numberOfOrdersFor(Collection orders,String customer){
        int result = 0;
        Iterator iter = orders.iterator();
        while(iter.hasNext()){
            Order each = (Order)iter.next();
            if(each.getCustomerName().equals(customer)){
                result ++;
            }
        }
        return result;
    }
}

class CustomerC{

    private final String _name;

    private static Dictionary _instances = new Hashtable();

    static void loadCustomers(){
        new CustomerC("Lemon Car Hire").store();
        new CustomerC("assssss").store();
        new CustomerC("bbbbbbbbb").store();
    }

    private void store(){
        _instances.put(this.getName(),this);
    }

    private CustomerC(String name){
        _name = name;
    }

    public String getName(){
        return _name;
    }

    public static CustomerC create(String name){
        return (CustomerC) _instances.get(name);
    }
}
