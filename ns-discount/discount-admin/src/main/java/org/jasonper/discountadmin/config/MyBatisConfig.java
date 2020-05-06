package org.jasonper.discountadmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 9:23
 * @description MyBatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"org.jasonper.discountmbg.mapper","org.jasonper.discountadmin.dao"})
public class MyBatisConfig {

}
