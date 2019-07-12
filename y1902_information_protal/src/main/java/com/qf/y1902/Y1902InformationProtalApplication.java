package com.qf.y1902.y1902_information_protal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class Y1902InformationProtalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Y1902InformationProtalApplication.class, args);
    }

}
