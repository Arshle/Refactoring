/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Person.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Person {
    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup _bloodGroup;

    public Person(int bloodGroup){
        _bloodGroup = BloodGroup.code(bloodGroup);
    }

    public Person(BloodGroup bloodGroup){
        _bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup(){
        return _bloodGroup;
    }

    public void setBloodGroup(int arg){
        _bloodGroup = BloodGroup.code(arg);
    }

    public int getBloodGroupCode(){
        return _bloodGroup.getCode();
    }
}

class BloodGroup{
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static final BloodGroup[] _values = {O,A,B,AB};

    private final int _code;

    private BloodGroup(int code){
        _code = code;
    }

    public int getCode(){
        return _code;
    }

    public static BloodGroup code(int arg){
        return _values[arg];
    }
}
