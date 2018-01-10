/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: JobItem.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class JobItem {

    private int _unitPrice;
    private int _quantity;
    private boolean _isLabor;
    protected Employee _employee;

    public JobItem(int unitPrice,int quantity){
        this(unitPrice,quantity,false);
    }

    protected JobItem(int unitPrice,int quantity,boolean isLabor){
        _unitPrice = unitPrice;
        _quantity = quantity;
        _isLabor = isLabor;
    }

    protected boolean isLabor(){
        return false;
    }

    public int getTotalPrice(){
        return getUnitPrice() * _quantity;
    }

    public int getUnitPrice(){
        return _unitPrice;
    }

    public int getQuantity(){
        return _quantity;
    }
}

class LaborItem extends JobItem{

    public Employee getEmployee(){
        return _employee;
    }

    protected boolean isLabor(){
        return true;
    }

    public LaborItem(int quantity,Employee employee){
        super(0,quantity,true);
        _employee = employee;
    }

    public int getUnitPrice(){
        return _employee.getRate();
    }

    public LaborItem(int unitPrice,int quantity,boolean isLabor,Employee employee){
        super(unitPrice,quantity,isLabor);
        _employee = employee;
    }
}
