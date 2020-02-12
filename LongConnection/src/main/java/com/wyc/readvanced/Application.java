package com.wyc.readvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * SpringBoot 入口类
 *
 * @author BBF
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@PropertySource(encoding = "UTF-8", value = {"classpath:config/mqtt.properties"} , ignoreResourceNotFound = false)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}