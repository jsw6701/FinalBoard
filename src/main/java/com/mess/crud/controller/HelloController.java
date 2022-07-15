package com.mess.crud.controller;

import com.mess.crud.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON(데이터)를 반환하는 컨트롤러
public class HelloController {
    @GetMapping("/hello") //HTTP Method인 GET 요청 받을 수 있는 애노테이션
    public String hello(){
        return "hello Spring Boot!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name, @RequestParam("nickname") String nickname){
        return new HelloResponseDto(name, nickname); //RequestParam : 외부에서 API로 넘긴 파라미터 @RequestParam("name") String name, @RequestParam("nickname")를 가져와 String name, String nickname에 각각저장
    }

}
