package com.holy.webservice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

    public static void main(String[] args) {
        // SpringApplication.run --> 내장 WAS 실행 ( 참고로 배민정도의 트래픽을 가진 회사도 내장 WAS로도 문제가 없다 )
        SpringApplication.run(WebServiceApplication.class, args);
    }

}
