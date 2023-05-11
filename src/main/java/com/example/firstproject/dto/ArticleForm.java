//폼 데이터를 받아옴
package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    // 두 개의 데이터를 던졌으니 두 개의 필드 선언
    private String title;
    private String content;


    // 생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }


    //데이터가 잘 받아졌는지 확인
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
    // toEntity 메소드는 Article 타입을 반환하기 원하기 때문에, 리턴
    // 이 Article은 Entity class
    // Entity class의 객체를 생성해야하기 떄문에, 생성자를 호출 (id, title, content)
}
