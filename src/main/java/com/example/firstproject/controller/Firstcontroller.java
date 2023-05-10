package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontroller {

    @GetMapping("/hi") // URL 연결 요청 @GetMapping("주소") : annotiation, hi라는 url 입력받으면 greetings.mustache를 찾아서 반환해줌
    public String niceToeMeetyou(Model model) { // 모델 받아오기 파라미터에추가, class import
        model.addAttribute("username", "yiji"); // 변수등록, model이라는 객체가 yiji라는 값을 username이라는 이름에 연결시켜서 보내주는 것

        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송

    }
}
