package com.example.processordemo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 张豫耀 on 2017/9/8.
 */
//  Target 用于描述注解的使用范围    ElementType.TYPE  用于描述类、接口(包括注解类型)
@Target(ElementType.TYPE)
// Retention 描述注解的生命周期    RetentionPolicy.RUNTIME  在运行时有效
@Retention(RetentionPolicy.RUNTIME)
//   定义注解格式：  public @interface 注解名{定义体}
public @interface ContentView {
    int value();
}
