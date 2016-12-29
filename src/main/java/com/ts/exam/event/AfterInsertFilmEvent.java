package com.ts.exam.event;


import org.springframework.context.ApplicationEvent;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
public class AfterInsertFilmEvent extends ApplicationEvent{

    private String msg;

    public AfterInsertFilmEvent(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void afterInsertFilmEvent() {
        System.out.println(msg);
    }
}
