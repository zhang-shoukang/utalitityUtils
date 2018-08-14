package com.zsk.java;

/**
 * Create by zsk on 2018/7/31
 **/
public class BasicType {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer a2 = 12;
        Integer b2 = 12;
        Byte by1=123;
        Byte by2=123;
        Character ch1 = '\uFFFF';
        Character ch2 = '\uFFFF';


        //Byte by3=129;
        //Byte by4=129;
        Boolean boolean1 = true;
        Boolean boolean2 = true;
        System.out.println(ch1==ch2);
        System.out.println(a==b);
        System.out.println(a2==b2);
        System.out.println(by1==by2);
        //System.out.println(by3==by4);
        System.out.println(boolean1==boolean2);
    }
}
