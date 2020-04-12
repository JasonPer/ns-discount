package org.jasonper.discountportal.config;

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
@MapperScan({"org.jasonper.discountmbg.mapper","org.jasonper.discountportal.dao"})
public class MyBatisConfig {

}
