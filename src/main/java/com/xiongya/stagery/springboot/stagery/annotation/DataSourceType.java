package com.xiongya.stagery.springboot.stagery.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:08
 */
//定义该注解作用在哪里，这里是定义该注解作用在类上
@Target(ElementType.TYPE)
//该注解在运行时起作用
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSourceType {

    //策略名
    String value() default "";
}
