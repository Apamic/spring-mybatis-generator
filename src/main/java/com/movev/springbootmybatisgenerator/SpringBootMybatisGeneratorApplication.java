package com.movev.springbootmybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//批量扫描mapper
@MapperScan(value = "com.movev.springbootmybatisgenerator.mapper")

//bean路径
//@ComponentScan(basePackages = {"com.movev.springbootmybatisgenerator.bean"})


//(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication

public class SpringBootMybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisGeneratorApplication.class, args);
    }
}
