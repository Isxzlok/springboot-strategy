package com.xiongya.stagery.springboot.stagery.init;

import com.xiongya.stagery.springboot.stagery.annotation.DataSourceType;
import com.xiongya.stagery.springboot.stagery.utils.CacheCollection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.net.URL;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-04-16 14:32
 */
@Component
public class InitDataSource {

    @Value("${package}")
    private String packageVo;

    @PostConstruct
    public void init(){
        initAllDataSourceType(packageVo);
    }

    public void initAllDataSourceType(String packageVo){
        URL url = this.getClass().getClassLoader().getResource(packageVo.replace(".", "/"));

        File dir = new File(url.getFile());
        //这个url.getFile()便是/Users/xiongzhilong/IdeaProjects/springboot-stagery/target/classes/com/xiongya/stagery/springboot/stagery/operation
        //遍历该目录下的字节码文件对象
        for(File file : dir.listFiles()){
            //判断该文件是都是一个目录
            if (file.isDirectory()){
                continue;
            }else {
                //不是目录
                //获取完整类名
                String className = packageVo + "." +file.getName().replace(".class", "");
                try{
                    //获取类对象
                    Class<?> clazz = Class.forName(className);
                    //判断该类上是否存在指定注解
                    if (clazz.isAnnotationPresent(DataSourceType.class)){
                        //如果存在，得到此注解的value值
                        DataSourceType dataSourceType = clazz.getAnnotation(DataSourceType.class);
                        //放入容器
                        CacheCollection.putClass(dataSourceType.value(), clazz);
                    }
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                    continue;
                }

            }

        }


    }

}
