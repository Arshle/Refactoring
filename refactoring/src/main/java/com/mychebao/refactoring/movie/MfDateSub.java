/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: MfDateSub.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.Date;

/**
 * @author zhangdanji
 */
public class MfDateSub extends Date {

    public MfDateSub(){

    }

    public MfDateSub(String dateString){
        super(dateString);
    }

    public MfDateSub(Date arg){
        super(arg.getTime());
    }
}

class MfDateWrap{

    private Date _original;

    public MfDateWrap(String dateString){
        _original = new Date(dateString);
    }

    public MfDateWrap(Date arg){
        _original = arg;
    }
}
