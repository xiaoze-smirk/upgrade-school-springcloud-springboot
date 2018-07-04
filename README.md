# 基于Springcloud的school项目

Springcloud是一系列框架的有序集合。它利用Springboot的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用Springboot的开发风格做到一键启动和部署。所以Springcloud几乎是现在微服务开源界最好的产品了。school-springcloud-springboot是一个基于Springcloud的课程管理系统，服务通过Http2之间协调调用，使得系统解耦。由于Springcloud的出现，现成的系统都可以拆分成更小的粒度，变得更加灵活，同时Springboot能极大的降低Springcloud的配置，能使你能够快速得开发项目。

## 一、运行工具、技术与环境

* 运行环境：JDK 8，Maven 3.3+
* 技术栈：SpringBoot 2.0+、Springcloud、Druid、Thymeleaf、Mybatis
* 工具：IntelliJ IDEA、谷歌浏览器、Mysql

## 二、Springboot快速集成Springcloud关键的依赖
```gradle
dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.3.RELEASE")
}

dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:Finchley.RELEASE"
    }
}

```

## 三、使用步骤
1.将项目导入IntelliJ IDEA，gradle加载jar包。

2.将sql文件夹里面的脚步导入到mysql中，使得数据库里面有数据。

3.项目启动顺序：eureka-server → gateway-server → user-operation → main-operation → main-school

4.打开浏览器，输入网址[http://localhost:8095](http://localhost:8095)即可浏览（账号：000101  密码：123456）。

## 四、总结
这个Springcloud项目我会有空的时候就升级，加油！Give Me Five！

------

smirk小泽   
2018 年 07月04日    
