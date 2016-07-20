package com.demo.springjpademo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ImportResource("jpa.xml")
@ComponentScan("com.demo.springjpademo")
@EnableJpaRepositories
public class AppConfig {
}
