package com.onpc.amsdata;

import com.onpc.amsdata.controllers.ArticleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.File;

@SpringBootApplication
public class AmsDataApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new File(ArticleController.uploadDirectory).mkdir();
        SpringApplication.run(AmsDataApplication.class, args);
    }

}
