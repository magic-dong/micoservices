package com.lzd.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Payment9002Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞAlibaba Payment 9002启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
