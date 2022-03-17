package com.jonghwa.Spring_Project.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본 생성자 추가 public Posts(){} 와 같은 효과
@Entity

public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(length = 500,nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
