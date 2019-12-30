package com.tangp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@ImportResource：导入Spring的配置文件，让配置文件里面的内容生效；
//@ImportResource(locations = {"classpath:beans.xml"})  
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
