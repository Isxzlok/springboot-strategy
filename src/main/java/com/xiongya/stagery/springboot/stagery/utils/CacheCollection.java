package com.xiongya.stagery.springboot.stagery.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:26
 */
public class CacheCollection {

    private static Map<String, Class> All_DATA_SOURCE;

    static{
        All_DATA_SOURCE = new HashMap<>(100);
    }

    /**
     *
     * 根据策略名获取Class
     * @param dsType
     * @return
     */
    public static Class getDS(String dsType){
        return All_DATA_SOURCE.get(dsType);
    }

    /**
     * 策略名为key， class为value
     * @param dsType
     * @param clazz
     */
    public static void putClass(String dsType, Class clazz){
        All_DATA_SOURCE.put(dsType, clazz);
    }

}
