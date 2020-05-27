package com.zuul;

//import com.zuul.filters.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class SpringZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulDemoApplication.class, args);
	}

//	@Bean
//	public SimpleFilter simpleFilter() {
//		return new SimpleFilter();
//	}

}
