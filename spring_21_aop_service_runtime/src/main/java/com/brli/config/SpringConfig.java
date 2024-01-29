package com.brli.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.brli")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
