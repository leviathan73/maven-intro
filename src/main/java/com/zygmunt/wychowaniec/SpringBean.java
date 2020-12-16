package com.zygmunt.wychowaniec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    @Autowired
    SpringBean2 springBean2;

    @Value("sweet")
    private String name;

    public void showMessage() {
        springBean2.run(name);
    }

}
