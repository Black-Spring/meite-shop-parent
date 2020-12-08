package com.mayikt;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @Description:
 * @Param:
 * @return:Anything
 * @date 2020-12-04 15:12:02
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class AppWeiXin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class,args);
    }
}