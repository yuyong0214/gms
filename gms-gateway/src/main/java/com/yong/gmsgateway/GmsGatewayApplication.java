package com.yong.gmsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GmsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsGatewayApplication.class, args);
    }

}
