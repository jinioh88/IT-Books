package com.example.ch04;

import com.example.ch04.domain.Board;
import com.example.ch04.domain.User;
import com.example.ch04.domain.enums.BoardType;
import com.example.ch04.repository.BoardRepository;
import com.example.ch04.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.UnknownServiceException;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class Ch04Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch04Application.class, args);
    }

    @Bean
    public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) throws Exception {
        return (args) -> {
            User user = userRepository.save(User.builder().name("havi").password("test").email("havi@gmail.com")
                    .createdDate(LocalDateTime.now()).build());

            IntStream.rangeClosed(1, 200).forEach(index -> boardRepository.save(Board.builder().title("게시글" + index).subTitle("서브 타이틀").content("콘텐츠")
                    .boardType(BoardType.free).createdDate(LocalDateTime.now()).updatedDate(LocalDateTime.now())
                    .user(user).build()));
        };
    }
}
