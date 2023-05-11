// new.mustache 페이지를 보기 위해 컨트롤러 추가

package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 골뱅이(어노테이션)
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new") //브라우저에서 접속하는 URL 주소 연결 (/articles/new라고 입력했을때 보여질 수 있게) .. 여기서는 "/"articles/new
    public String newArticleForm() {
        return "articles/new"; //view 페이지 연결
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        // System.out.println(form.toString()); // 실제서버에는 println으로 검증하는건 기록에도남지도 않고 서버 성능 저하 - 로깅으로 대체
        //dto로 만든 클래스, 폼 타입의 파라미터 선언 > 폼데이터로 받은 데이터가 ArticleForm 파라미터로 던져짐

        // 1. DTO를 Entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());
        // System.out.println(article.toString()); //DTO가 Entity로 잘 변환됐는지 확인
        /* 폼을 가지고 toEntity라는 메소드를 호출해서 article이라는 타입의 형식으로 반환해옴
        DTO인 form에서 Entity 객체로 변환하는 메소드를 추가하기
        */

        // 2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        // System.out.println(saved.toString()); //article이 잘 save됐는지 확인
        /* articleRepository가 save라는 메소드를 호출하게 함
            1에서 만든 article 데이터를 save
            save된 데이터를 최종적으로 반환
            Article entity 타입으로 saved라는 이름을 가지고 반환
            8강 13:05
         */



        return "";

    }
}
