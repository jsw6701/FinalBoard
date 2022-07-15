package com.mess.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //이 애노테이션이 붙은 클래스가 메인 클래스
//SpringBootApplication이 있는 위치부터 설정을 읽기 때문에 항상 프로젝트 최상단에 위치해야함
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
