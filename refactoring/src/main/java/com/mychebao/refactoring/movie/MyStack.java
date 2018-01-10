/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: MyStack.java
 * Author:   zhangdanji
 * Date:     2017年09月12日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.util.Vector;

/**
 * @author zhangdanji
 */
public class MyStack{

    private Vector _vector = new Vector();

    public void push(Object element){
        _vector.insertElementAt(element,0);
    }

    public Object pop(){
        Object result = _vector.firstElement();
        _vector.removeElementAt(0);
        return result;
    }

    public int size(){
        return _vector.size();
    }

    public boolean isEmpty(){
        return _vector.isEmpty();
    }
}
