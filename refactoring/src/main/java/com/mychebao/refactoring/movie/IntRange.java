/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IntRange.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangdanji
 */
public class IntRange {

    private int _low,_high;

    IntRange(int low,int high){
        initialize(low,high);
    }

    private void initialize(int low,int high){
        _low = low;
        _high = high;
    }

    int getLow(){
        return _low;
    }

    int getHigh(){
        return _high;
    }

    void setLow(int arg){
        _low = arg;
    }

    void setHigh(int arg){
        _high = arg;
    }

    boolean includes(int arg){
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor){
        setHigh(getHigh() * factor);
    }

    public static void main(String[] args) {
        List<IntRange> list = new ArrayList<IntRange>();
        for(int i = 0; i < 5; i ++){
            list.add(new IntRange(i, 0));
        }
        List<IntRange> unlist = Collections.unmodifiableList(list);
        unlist.remove(0);
    }
}
