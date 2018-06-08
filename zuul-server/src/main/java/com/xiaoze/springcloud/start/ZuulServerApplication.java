package com.xiaoze.springcloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ZuulServerApplication
 *
 * @author xiaoze
 * @date 2018/6/7
 *
 * EnableEurekaClient 服务发现，会去注册中心自动注册服务，Eureka专用
 * EnableDiscoveryClient 服务发现，会去注册中心自动注册服务
 * EnableZuulProxy 开启zuul代理
 *
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
