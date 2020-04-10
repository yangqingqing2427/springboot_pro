package com.itgaoshu;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;
//如果使用通用Mapper接口，导的是这个包

@SpringBootApplication //(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.itgaoshu.mapper") //扫描,或者在UserMapper里面写@Mappwer
@EnableCaching  //开启缓存（redis）
public class FirstSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringbootApplication.class, args);
    }

}
