package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合mybatis-plus
 *      1）、导入依赖
 *   <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *         </dependency>
 *      2）、配置
 *         1、配置数据源
 *         1）.导入数据库驱动
 *         2）。创建一个application.yml文件，配置数据源相关信息（spring datasource username，密码，url，driver）
 *         2、配置mybatis-plus
 *         1).使用MapperScan(告诉mybatis-plus，mybatis的mapper接口在哪里)
 *         2).告诉mybatis-plus ，sql映射文件在哪里(在application.yml 配置),并且设置逐渐自增， classpsth*，是扫描所有，classpath,扫描自己类下
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
