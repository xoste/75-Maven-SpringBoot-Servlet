package com.xoste.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Leon
 */
@SpringBootApplication
@ServletComponentScan // springboot启动时扫描注解@WebServlet，将该类实例化
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
