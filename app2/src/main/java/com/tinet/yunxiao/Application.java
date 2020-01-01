package com.tinet.yunxiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.tinet.yunxiao")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class Application {
	public static void main(String[] args) throws Exception {

		// 设置JVM的DNS缓存时间，详见：http://docs.amazonaws.cn/AWSSdkDocsJava/latest/DeveloperGuide/java-dg-jvm-ttl.html
		java.security.Security.setProperty("networkaddress.cache.ttl", "60");

		SpringApplication.run(Application.class, args);
	}
}