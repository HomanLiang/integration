package com.homan.integration.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 项目启动入口
 * @author: Homan Liang
 * @time: 2021/5/6 14:26
 */
@SpringBootApplication(scanBasePackages = {"com.homan.integration.service","com.homan.integration.web"})
public class IntegrationApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IntegrationApp.class, args);
    }
}
