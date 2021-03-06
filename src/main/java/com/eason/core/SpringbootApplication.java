package com.eason.core;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * spring boot starter
 *
 * @author fengyingsheng
 */
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(value = "com.eason.core")
@EnableSwagger2
@EnableWebMvc
@Configuration
public class SpringbootApplication {

	public static void main(String[] args) {
		normalWay(args);
//        shutdownBanner(args);
	}

    private static void shutdownBanner(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    private static void normalWay(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }



}
