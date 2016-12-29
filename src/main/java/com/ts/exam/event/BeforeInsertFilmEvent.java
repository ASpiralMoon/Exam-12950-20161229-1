package com.ts.exam.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
public class BeforeInsertFilmEvent extends ApplicationEvent {

    private String msg;

    public BeforeInsertFilmEvent(String msg) {
        super(msg);
        this.msg=msg;
    }

    public void beforeInsertFilmEvent() {
        System.out.println(msg);
    }
}
