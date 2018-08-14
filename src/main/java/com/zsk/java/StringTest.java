package com.zsk.java;

/**
 * Create by zsk on 2018/7/31
 **/
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3==s4);  // true

        String c = new String("abcd").intern();
        String d = new String("abcd").intern();
        System.out.println(c == d);  // Now true
        System.out.println(c.equals(d)); // True
    }
}
