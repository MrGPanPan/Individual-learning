package com.pan.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: Qipan.G
 * Date: 2018/6/3
 * Time: 15:11
 * Descriptions: 标识线程不安全
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface UnThreadSafe {

    String value() default "";

}
