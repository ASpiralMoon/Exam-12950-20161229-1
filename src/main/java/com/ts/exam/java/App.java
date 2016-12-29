package com.ts.exam.java;

import com.ts.exam.controller.FilmController;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 入口
 */
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        FilmController filmController = (FilmController) cac.getBean("filmController");
        cac.start();
        filmController.start();
        cac.stop();
    }
}
