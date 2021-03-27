//package com.ex.smartcamp.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
///**
//* MyBatis配置类，配置相关扫描路径，
//* 包括DAO、Model、XML映射文件的扫描，
//* 在config包下新建一个Mybatis配置类
//* */
//
//@Configuration
//@MapperScan("com.springboot.**.dao") //扫描DAO
//public class MybatisConfig {
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setTypeAliasesPackage("com.springboot.**.model");
//        //扫描model
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactory.setMapperLocations(resolver.getResource("classpath*:**/sqlmap/*.xml"));//扫描映射文件
//        return sessionFactory.getObject();
//    }
//}
