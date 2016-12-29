package com.ts.exam.aop;

import com.ts.exam.event.AfterInsertFilmEvent;
import com.ts.exam.event.BeforeInsertFilmEvent;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by ASpiralMoon on 2016/12/29.
 * 切面
 */
@Aspect
@Component
public class Guardian implements ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Pointcut("execution(* com.ts.exam.dao.IFilmDao.*(..))")
    public void foundAdd() {
    }

    @Before("foundAdd()")
    public void beforeInsert() {
        applicationContext.publishEvent(new BeforeInsertFilmEvent("Before Insert Film Data"));
    }

    @After("foundAdd()")
    public void afterInsert() {
        applicationContext.publishEvent(new AfterInsertFilmEvent("After Insert Film Data"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
