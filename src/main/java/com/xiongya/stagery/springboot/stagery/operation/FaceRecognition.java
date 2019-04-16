package com.xiongya.stagery.springboot.stagery.operation;

import com.xiongya.stagery.springboot.stagery.annotation.DataSourceType;
import com.xiongya.stagery.springboot.stagery.base.DataSourceStrategy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:16
 */
@Component
@DataSourceType("faceRecognition")
public class FaceRecognition implements DataSourceStrategy {


    @Override
    public Map<String, Object> connect(Map<String, String> params) {
       //do something.....


        //返回结果
        Map map = new HashMap();
        map.put("type", "人脸识别");
        map.put("status", "success");
        return map;
    }
}
