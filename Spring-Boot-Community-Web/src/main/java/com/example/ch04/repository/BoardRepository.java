package com.example.ch04.repository;

import com.example.ch04.domain.Board;
import com.example.ch04.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
