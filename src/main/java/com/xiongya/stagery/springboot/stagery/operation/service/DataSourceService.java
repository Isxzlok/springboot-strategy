package com.xiongya.stagery.springboot.stagery.operation.service;

import com.xiongya.stagery.springboot.stagery.base.DataSourceStrategy;
import com.xiongya.stagery.springboot.stagery.init.DataSourceContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 15:13
 */
@Component
public class DataSourceService {


    @Autowired
    private DataSourceContextAware dataSourceContextAware;

    public Map<String, Object> connect(String dsType, Map<String, String> map){

        DataSourceStrategy dataSourceStrategy = dataSourceContextAware.getStrategyInstance(dsType);
        return dataSourceStrategy.connect(map);
    }

}
