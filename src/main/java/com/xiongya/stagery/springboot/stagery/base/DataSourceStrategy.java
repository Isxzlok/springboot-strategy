package com.xiongya.stagery.springboot.stagery.base;

import java.util.Map;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:14
 */
public interface DataSourceStrategy {

    //每个策略的逻辑实现
    Map<String, Object> connect(Map<String, String> params);

}
