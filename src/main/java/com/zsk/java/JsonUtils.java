package com.zsk.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Create by zsk on 2018/8/14
 **/
public class JsonUtils {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将对象转为json字符串
     * @param data
     * @return
     */
    public static String objectToJson(Object data){
        try {
            String s = MAPPER.writeValueAsString(data);
            return s;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json字符串转为对象
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T> T jsonToPojo(String jsonData,Class<T> beanType){
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json字符串转为list数组。
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType){
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public static void main(String[] args) {
        String s = objectToJson(new Demo(1, 2, 3));
        System.out.println(s);
        String jsonStr="{\"a\":1,\"b\":2,\"c\":3}";
        Demo demo = jsonToPojo(jsonStr, Demo.class);
        System.out.println(demo.getA());
        String jsonArrayStr="[{\"a\":1,\"b\":2,\"c\":3},{\"a\":11,\"b\":12,\"c\":13}]";
        List<Demo> demos = jsonToList(jsonArrayStr, Demo.class);
        for (Demo de:
             demos) {
            System.out.println(de.getA());
        }
    }
}
