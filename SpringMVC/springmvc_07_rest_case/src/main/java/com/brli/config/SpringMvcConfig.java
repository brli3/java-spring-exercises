package com.brli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.brli.controller", "com.brli.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
