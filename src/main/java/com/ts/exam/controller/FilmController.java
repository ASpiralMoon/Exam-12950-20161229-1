package com.ts.exam.controller;

import com.ts.exam.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Controller
public class FilmController {

    @Autowired
    private IFilmService iFilmService;

    public void start() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("请输入电影名称(title)");
            String title = br.readLine();
            if ("".equals(title.trim())) {
                System.out.println("电影名称不能为空");
                start();
            }
            System.out.println("请输入电影描述(description)");
            String description = br.readLine();
            System.out.println("请输入电影语言");
            String languageId = br.readLine();
            if ("".equals(languageId.trim())) {
                System.out.println("电影语言不能为空");
                start();
            }
            boolean msg = iFilmService.addFilm(title, description, Byte.valueOf(languageId));
            if (msg) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败,请检查您输入的是否正确");
            }
            System.out.println("是否继续? Y/N");
            if ("Y".equals(br.readLine())) {
                start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
