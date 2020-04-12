package org.jasonper.discountsecurity.annotation;

import java.lang.annotation.*;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 10:10
 * @description 自定义注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
