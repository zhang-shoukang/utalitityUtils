package com.zsk.java;


import org.apache.commons.lang3.StringUtils;

/**
 * Create by zsk on 2018/7/31
 **/
public class TestIsBlankIsEmpty {
    public static void main(String[] args) {
        //___________________isEmpty_______________________________-----
        String a="";
        String b=null;
        String c=" ";
        String d="aa";
        System.out.println(StringUtils.isEmpty(a));
        System.out.println(StringUtils.isEmpty(b));
        System.out.println(StringUtils.isEmpty(c));
        System.out.println(StringUtils.isEmpty(d));

        //___________________isBlank___________________________________--

        System.out.println(StringUtils.isBlank(a));
        System.out.println(StringUtils.isBlank(b));
        System.out.println(StringUtils.isBlank(c));
        System.out.println(StringUtils.isBlank(d));

    }
}
