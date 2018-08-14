package com.zsk.java;



import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by zsk on 2018/7/31
 **/
public class ListToJsonArray {


    public static void main(String[] args) throws Exception{
        List<Demo> list  = new ArrayList<Demo>();
        list.add(new Demo(1,2,3));
        list.add(new Demo(4,5,6));
        list.add(new Demo(7,8,9));
       String s = ListToJsonArray(list);
        System.out.println(s);
        //getJsonArray(s);
       // System.out.println(getJsonArray(s));

        String str = "";
        List<Demo> lists = new ArrayList<Demo>();
        Gson gson = new Gson();
        lists = gson.fromJson(str, new TypeToken<List<Demo>>() {

        }.getType());
        if (!lists.isEmpty() && lists.size()>0) {
            for (Demo d : lists) {
                System.out.println(d);
            }
        }
    }

    public static String  ListToJsonArray(List<Demo> list) {
        JSONArray jsonArray = new JSONArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Demo d : list){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("first",d.getA());
            jsonObject.put("second",d.getA());
            jsonObject.put("thrid",d.getA());
            jsonArray.add(jsonObject);
        }
        stringBuilder.append(jsonArray);
        return stringBuilder.toString();
    }

}
class Demo{
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Demo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return this.a+","+this.b;
    }
}
class MessageObject implements Serializable{
    private String ad_id;
    private String adv_id;
    private String order_id;

    public MessageObject() {
    }

    @Override
    public String toString() {
        return this.getAd_id()+','+this.getAdv_id()+','+this.getOrder_id();
    }

    public MessageObject(String ad_id, String adv_id, String order_id) {
        this.ad_id = ad_id;
        this.adv_id = adv_id;
        this.order_id = order_id;
    }

    public String getAd_id() {
        return ad_id;
    }

    public void setAd_id(String ad_id) {
        this.ad_id = ad_id;
    }

    public String getAdv_id() {
        return adv_id;
    }

    public void setAdv_id(String adv_id) {
        this.adv_id = adv_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
