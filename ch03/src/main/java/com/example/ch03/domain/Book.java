package com.example.ch03.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private Integer idx;
    @Column
    private String title;
    @Column
    private LocalDateTime publicshedAt;

    @Builder
    public Book(String title, LocalDateTime publicshedAt) {
        this.title = title;
        this.publicshedAt = publicshedAt;
    }
}
