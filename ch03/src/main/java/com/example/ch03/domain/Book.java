package com.example.ch03.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class Book {
    private Integer idkx;
    private String title;
    private LocalDateTime publicshedAt;

    @Builder
    public Book(String title, LocalDateTime publicshedAt) {
        this.title = title;
        this.publicshedAt = publicshedAt;
    }
}
