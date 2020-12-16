package com.zygmunt.wychowaniec;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        SpringBean firstBean = context.getBean(SpringBean.class);
        firstBean.showMessage();
        context.close();

    }
}
