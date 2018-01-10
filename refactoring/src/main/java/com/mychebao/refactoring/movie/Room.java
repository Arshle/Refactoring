/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Room.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Room {

    private Room.TempRange tempRange;

    private Room.TempRange daysTempRange(){
        return tempRange;
    }

    boolean withinPlan(HeatingPlan plan){
        return plan.withinRange(this.tempRange);
    }

    public class TempRange{

        private int low;
        private int high;

        int getLow(){
            return low;
        }

        void setLow(int low){
            this.low = low;
        }

        int getHigh(){
            return high;
        }

        void setHigh(int high){
            this.high = high;
        }
    }
}

class HeatingPlan{

    private Room.TempRange _range;

    boolean withinRange(Room.TempRange tempRange){
        return (tempRange.getLow() >= _range.getLow() && tempRange.getHigh() <= _range.getHigh());
    }
}
