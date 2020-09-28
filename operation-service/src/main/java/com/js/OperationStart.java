package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description 启动类
 * @Author jishubu
 * @ComponentScan 测试开发时开启注解可以运行swagger
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ImportResource(value = {"classpath:dubbo/spring-dubbo.xml"})
@Slf4j
public class OperationStart {
    public static void main(String[] args) {
        try{
            SpringApplication.run(OperationStart.class,args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        }catch (Exception e){
            log.info("项目启动失败");
        }

    }
}
