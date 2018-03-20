package com.farpower.datapermission.annotation.handler;

import com.farpower.datapermission.annotation.DataAuthAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DataAuthAnnotationHelper
{
    private static final Logger logger = LoggerFactory.getLogger(DataAuthAnnotationHelper.class);


    @After("@annotation(dataAuthAnnotation)")
    public void before(JoinPoint joinPoint, DataAuthAnnotation dataAuthAnnotation){

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        System.out.println("方法规则拦截拦截---------"+ method.getName());

        System.out.println("beforeTest:" + dataAuthAnnotation.value());

    }


}
