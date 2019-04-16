package com.xiongya.stagery.springboot.stagery;

import com.xiongya.stagery.springboot.stagery.base.DataSourceStrategy;
import com.xiongya.stagery.springboot.stagery.operation.service.DataSourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStageryApplicationTests {

    @Autowired
    private DataSourceService dataSourceService;

    @Test
    public void contextLoads() {
        Map<String, Object> map = dataSourceService.connect("fourElements", null);
        System.out.println(map);
    }

}
