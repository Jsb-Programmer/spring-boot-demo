package com.git.hui.boot.properties;

import com.git.hui.boot.properties.config.YmlProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by @author yihui in 14:08 18/9/19.
 */
@SpringBootApplication
public class Application {

    public Application(YmlProperties ymlProperties) {
        System.out.println(ymlProperties);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
