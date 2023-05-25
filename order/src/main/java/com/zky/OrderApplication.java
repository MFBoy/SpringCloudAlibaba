package com.zky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }


    /**
     *启动类也是配置类
     * RestTemplate调用接口
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) throws Exception {
        RestTemplate build = builder.build();
        return build;
    }
}
