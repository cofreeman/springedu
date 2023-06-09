package com.example.springedu;

import javax.sql.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springedu", "thymeleaf.exam", "springws.exam"})
@MapperScan(value = {"com.example.springedu.dao"})
@EnableScheduling
public class SpringeduApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringeduApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/edudb");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }
}

