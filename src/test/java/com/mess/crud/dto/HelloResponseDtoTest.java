package com.mess.crud.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "seungwoo";
        String nickname = "ClOr";

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, nickname); //필드 포함된 생성자

        //then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getNickname()).isEqualTo(nickname);
    }

}
