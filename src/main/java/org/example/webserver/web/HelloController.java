package org.example.webserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController - 컨트롤러의 리턴값을 JSON 으로 만들어준다.
@GetMapping - Get 요청을 받을 수 있는 API를 만들어준다.

 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
