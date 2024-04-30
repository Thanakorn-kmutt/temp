package com.example.integrated_task_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegratedTaskV1Application {
    //    @PostConstruct
    //    void started() {
    //        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    //    }


    public static void main(String[] args) {
        SpringApplication.run(IntegratedTaskV1Application.class, args);
    }

}
