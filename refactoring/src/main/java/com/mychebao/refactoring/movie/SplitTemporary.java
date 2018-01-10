/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: SplitTemporary.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class SplitTemporary {

    private double _primaryForce;
    private double _mass;
    private int _delay;
    private double _secondaryForce;

    double getDistanceTravelled(int time){
        double result;
        final double primaryAcc = _primaryForce / _mass;
        int primaryTime = Math.min(time,_delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if(secondaryTime > 0){
            double primaryVel = primaryAcc * _delay;
            final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }
}
