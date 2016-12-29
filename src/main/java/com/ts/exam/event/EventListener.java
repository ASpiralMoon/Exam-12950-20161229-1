package com.ts.exam.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Component
public class EventListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        if (applicationEvent instanceof BeforeInsertFilmEvent) {
            BeforeInsertFilmEvent bife = (BeforeInsertFilmEvent) applicationEvent;
            bife.beforeInsertFilmEvent();
        }

        if (applicationEvent instanceof AfterInsertFilmEvent) {
            AfterInsertFilmEvent aife = (AfterInsertFilmEvent) applicationEvent;
            aife.afterInsertFilmEvent();
        }

        // 容器启动时触发
        if(applicationEvent instanceof ContextStartedEvent){
            ContextStartedEvent cse=(ContextStartedEvent) applicationEvent;
            System.out.println("context Start");
        }

        // 容器关闭时触发
        if(applicationEvent instanceof ContextStoppedEvent){
            ContextStoppedEvent cse=(ContextStoppedEvent) applicationEvent;
            System.out.println("context stop");
        }

    }
}
