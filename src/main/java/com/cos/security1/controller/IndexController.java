package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //View를 리턴
public class IndexController {

    @GetMapping({"","/"})
    public String index() {
        //기본 폴더 경로: src/main/resources/
        return "index"; //자동으로 src/main/resources/templates/index.mustache 로 잡힘
    }

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }

    @GetMapping("/login") //스프링 시큐리티가 낚아채버림
    public String login(){
        return "loginForm";
    }

    @GetMapping("/join")
    @ResponseBody
    public String join(){
        return "join";
    }

    @GetMapping("/joinProc")
    @ResponseBody
    public String joinProc(){
        return "회원가입 완료";
    }
}
