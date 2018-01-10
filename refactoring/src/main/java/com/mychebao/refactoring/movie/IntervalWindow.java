/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: IntervalWindow.java
 * Author:   zhangdanji
 * Date:     2017年09月11日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangdanji
 */
public class IntervalWindow extends Frame implements Observer{

    TextField _startField;
    TextField _endField;
    TextField _lengthField;

    private Interval _subject;

    IntervalWindow(){
        _subject = new Interval();
        _subject.addObserver(this);
        update(_subject,null);
    }

    String getEnd(){
        return _subject.getEnd();
    }

    void setEnd(String arg){
        _subject.setEnd(arg);
    }

    public void update(Observable o, Object arg) {
        _endField.setText(_subject.getEnd());
    }

    class SymFocus extends FocusAdapter{

        public void focusLost(FocusEvent event){
            Object object = event.getSource();
            if(object == _startField){
                StartField_FocusLost(event);
            }else if(object == _endField){
                EndField_FocusLost(event);
            }else if(object == _lengthField){
                LengthField_FocusLost(event);
            }
        }

        void StartField_FocusLost(FocusEvent event){
            if(isNotInteger(_startField.getText())){
                _startField.setText("0");
            }
            calculateLength();
        }

        void EndField_FocusLost(FocusEvent event){
            setEnd(_endField.getText());
            if (isNotInteger(getEnd())) {
                setEnd("0");
            }
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event){
            if(isNotInteger(_lengthField.getText())){
                _lengthField.setText("0");
            }
            calculateEnd();
        }

        void calculateLength(){
            try {
                int start = Integer.parseInt(_startField.getText());
                int end = Integer.parseInt(getEnd());
                int length = end - start;
                _lengthField.setText(String.valueOf(length));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        void calculateEnd(){
            try {
                int start = Integer.parseInt(_startField.getText());
                int length = Integer.parseInt(_lengthField.getText());
                int end = start + length;
                setEnd(String.valueOf(end));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        private boolean isNotInteger(String value){
            if(value == null || "".equals(value) || "".equals(value.trim())){
                return false;
            }
            try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
}

class Interval extends Observable{
    private String _end = "0";

    String getEnd(){
        return _end;
    }

    void setEnd(String arg){
        _end = arg;
        setChanged();
        notifyObservers();
    }
}
