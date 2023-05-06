package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //View를 리턴
public class IndexController {

    @GetMapping({"","/"})
    public String index() {
        //기본 폴더 경로: src/main/resources/
        return "index"; //자동으로 src/main/resources/templates/index.mustache 로 잡힘
    }

    @GetMapping("/hello")
    public String hello(){
        return "test";
    }
}
