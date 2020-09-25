package com.lzd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServer7002Application.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞEureka Server 7002启动成功   ლ(´ڡ`ლ)ﾞ");
	}

}
