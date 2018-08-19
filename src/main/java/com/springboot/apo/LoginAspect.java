package com.springboot.apo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoginAspect {
    @Before("execution( * com.springboot.apo.*.*(..))")
    public void log(){
        System.out.println("my log"+ AopContext.currentProxy().getClass());
    }
    @After("execution( * com.springboot.apo.*.*(..))")
    public void log2(JoinPoint point){
        System.out.println("after method"+point.getTarget().getClass()+"args"+ Arrays.asList(point.getArgs()));
    }
}
