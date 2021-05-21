package com.zheng.payment8005;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.zheng.payment8005.dao")
@EnableDiscoveryClient
public class CloudConsulPayment8005Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulPayment8005Application.class, args);
    }
    @Bean(name ="dataSource1" )
    DataSource dataSource1(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://192.168.7.77:3306/school_db?characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        driverManagerDataSource.setDriverClassName(" com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
    @Bean(name="dataSource2")
    DataSource dataSource2(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://192.168.7.77:3306/school_db?characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        driverManagerDataSource.setDriverClassName(" com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
    @Bean(name="dataSource3")
    DataSource dataSource3(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://192.168.7.77:3306/school_db?characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        driverManagerDataSource.setDriverClassName(" com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
    @Bean(name = "qlSessionFactoryBean1")
    SqlSessionFactoryBean sqlSessionFactoryBean1(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("classpath*:/Mapper/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSource1());
        return sqlSessionFactoryBean;
    }
    @Bean(name = "qlSessionFactoryBean2")
    SqlSessionFactoryBean sqlSessionFactoryBean2(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("classpath*:/Mapper/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSource2());
        return sqlSessionFactoryBean;
    }
    @Bean(name = "qlSessionFactoryBean3")
    SqlSessionFactoryBean sqlSessionFactoryBean3(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("classpath*:/Mapper/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSource3());
        return sqlSessionFactoryBean;
    }
    @Bean
    MapperFactoryBean mapperFactoryBean(){
        MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();
        mapperFactoryBean.setSqlSessionFactory((SqlSessionFactory)sqlSessionFactoryBean1());
        return null;
    }


}
