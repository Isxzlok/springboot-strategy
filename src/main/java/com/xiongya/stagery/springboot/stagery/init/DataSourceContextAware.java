package com.xiongya.stagery.springboot.stagery.init;

import com.xiongya.stagery.springboot.stagery.base.DataSourceStrategy;
import com.xiongya.stagery.springboot.stagery.utils.CacheCollection;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 15:14
 */
@Component
public class DataSourceContextAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public DataSourceStrategy getStrategyInstance(String dsType){
        Class clazz = CacheCollection.getDS(dsType);
        DataSourceStrategy dataSourceStrategy = (DataSourceStrategy) applicationContext.getBean(clazz);
        return dataSourceStrategy;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }
}
