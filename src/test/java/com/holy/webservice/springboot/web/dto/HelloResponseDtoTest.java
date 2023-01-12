package com.holy.webservice.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
                            // 검증하고 싶은 대상이 인자
        Assertions.assertThat(dto.getName()).isEqualTo(name);       // assertThat -> assertj라는 테스트 검증 라이브러리의 검증 메소드
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
