package com.zygmunt.wychowaniec;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    void run(String name) {
        System.out.println("from second " + name);
        System.err.println(name);
    }
}
