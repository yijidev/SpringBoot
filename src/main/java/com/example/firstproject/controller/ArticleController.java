// new.mustache 페이지를 보기 위해 컨트롤러 추가

package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new") //브라우저에서 접속하는 URL 주소 연결 (/articles/new라고 입력했을때 보여질 수 있게) .. 여기서는 "/"articles/new
    public String newArticleForm() {
        return "articles/new"; //view 페이지 연결
    }
}
