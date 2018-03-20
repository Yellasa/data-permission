package com.farpower.datapermission.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})//定义注解的作用目标**作用范围字段、枚举的常量/方法、描述类、接口(包括注解类型) 或enum声明
@Documented//说明该注解将被包含在javadoc中
public @interface DataAuthAnnotation
{


    //权限资源的code
    String value() default "";

    //String tables() default "";

    /**
     * 0、 如果为空字符串，则使用默认值view_org,view_emp为数据权限过滤条件
     * 1、 单表的非默认字段直接传递{"fileds":"age,name"}即可
     * 2、 多表的字段用[{"table":"person","fileds":"age,name"},{...,...},{...,...}]表示,其中必需包含table属性
     * @return
     */
    String fields() default "";

}
