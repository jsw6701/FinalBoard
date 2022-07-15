package com.mess.crud.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class) // Web에 집중가능 어노테이션
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc; //웹 API 테스트 사용

    @Test
    public void hello_Test() throws Exception{
        String hello = "hello Spring Boot!";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    public void helloDto_Test() throws Exception {
        String name = "seungwoo";
        String nickname = "ClOr";
        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("nickname", nickname))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.nickname", is(nickname)));
    }
}
