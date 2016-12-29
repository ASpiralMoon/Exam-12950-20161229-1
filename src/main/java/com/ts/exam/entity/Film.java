package com.ts.exam.entity;

import org.springframework.stereotype.Component;

/**
 * Created by ASpiralMoon on 2016/12/29.
 * 电影实体类
 */
@Component
public class Film {

    private String title; // 电影标题
    private String description; // 电影描述
    private Byte languageId; // 电影语言

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }
}
