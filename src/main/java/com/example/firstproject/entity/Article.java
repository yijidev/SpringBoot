package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능 - DB가 알 수 있는 규격화된 객체 entity
@AllArgsConstructor // 모든 필드에 있는 constructor 생성 - id, title, content를 파라미터로 하는 생성자를 자동으로 만들어줌
@ToString

public class Article {

    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue // 1, 2, 3 .... 자동 생성 어노테이션
    private Long id;
    @Column
    // DB에서 이해할 수 있게 컬럼 어노테이션 붙여줘야함: db에서 관리하는 테이블이라는 단위에 연결되게 만들어줌
    private String title;

    @Column
    private String content;

}
