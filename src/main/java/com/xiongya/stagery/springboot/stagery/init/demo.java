package com.xiongya.stagery.springboot.stagery.init;

import java.net.URL;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:43
 */
public class demo {



    public static void main(String[] args) {

        URL url = new demo().getClass().getClassLoader().getResource("com.xiongya.stagery.springboot.stagery.operation".replace(".", "/"));
        String str = url.getFile();

        System.out.println(str);
    }



}
