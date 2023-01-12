package com.holy.webservice.springboot.web;

import com.holy.webservice.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 컨트롤러로 만들어주는 어노테이션
// 원래는 각 메소드마다 @Responsebody를 선언했던 것을 한번에 해준다.
public class HelloController {

    /**
     * /hello 일시
     * hello를 리턴하는 간단한 API
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /**
     *
     */
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount
                                     ) {
        return new HelloResponseDto(name, amount);
    }


}
