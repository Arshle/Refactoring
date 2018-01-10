/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: Currency.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

/**
 * @author zhangdanji
 */
public class Currency {

    private String _code;

    public String getCode(){
        return _code;
    }

    private Currency(String code){
        _code = code;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(Currency.class.isInstance(obj))){
            return false;
        }
        Currency other = (Currency) obj;
        return (_code.equals(other._code));
    }

    @Override
    public int hashCode() {
        return _code.hashCode();
    }
}
