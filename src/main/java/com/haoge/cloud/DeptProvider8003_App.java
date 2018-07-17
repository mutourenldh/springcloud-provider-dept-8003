package com.haoge.cloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 
* @author 李东浩
* @Date：2018年4月29日下午2:10:32
*
*/
@SpringBootApplication
@EnableEurekaClient//这个注解的意思是本服务启动后会自动注册进eureka服务端中
@EnableDiscoveryClient//允许服务发现的注解
public class DeptProvider8003_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
