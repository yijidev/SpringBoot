package com.example.firstproject.repository;


import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// JPA에서 제공하는 리포지터리 인터페이스를 활용해서 만들기
// 이 ArticleRepository는 CrudRepository가 제공하고 있는 기능들을 정의 없이 확장받아서 사용 가능 - 기본 동작 추가코드 구현X
public interface ArticleRepository extends CrudRepository<Article, Long> {
// 꺽쇠 앞쪽에 관리대상 엔티티, 뒤에는 대표값의 타입
}
