package com.mess.crud.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //선언된 모든 final이 붙은 필드가 포함된 생성자를 생성함
public class HelloResponseDto {
    private final String name;
    private final String nickname;
}
