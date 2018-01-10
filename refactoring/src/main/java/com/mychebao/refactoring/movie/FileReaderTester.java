/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: FileReaderTester.java
 * Author:   zhangdanji
 * Date:     2017年09月09日
 * Description:   
 */
package com.mychebao.refactoring.movie;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author zhangdanji
 */
public class FileReaderTester extends TestCase{

    private Reader _input;

    public FileReaderTester(String name){
        super(name);
    }

    public void testRead() throws IOException{
        char ch = '&';
        for(int i = 0; i < 4; i++){
            ch = (char)_input.read();
        }
        assertEquals(-1,_input.read());
    }

    public void testReadBoundaries() throws IOException{
        assertEquals("read first char",'B',_input.read());
        int ch;
        for(int i = 0; i < 140; i ++){
            ch = _input.read();
        }
        assertEquals("read last char",'6',_input.read());
        assertEquals("read at end",-1,_input.read());
    }

    public static Test suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));
        suite.addTest(new FileReaderTester("testReadAtEnd"));
        return suite;
    }

    protected void setUp(){
        try {
            _input = new FileReader("/Users/zhangdanji/Desktop/data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("unable to open text file");
        }
    }

    protected void tearDown(){
        try {
            _input.close();
        } catch (IOException e) {
            throw new RuntimeException("error on closing test file");
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new TestSuite(FileReaderTester.class));
    }
}
