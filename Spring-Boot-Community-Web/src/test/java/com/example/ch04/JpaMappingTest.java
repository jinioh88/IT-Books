package com.example.ch04;

import com.example.ch04.domain.Board;
import com.example.ch04.domain.User;
import com.example.ch04.domain.enums.BoardType;
import com.example.ch04.repository.BoardRepository;
import com.example.ch04.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaMappingTest {
    private final String boardTestTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @Before
    public void init() {
        User user = userRepository.save(User.builder().name("havi").password("test").email(email)
                .createdDate(LocalDateTime.now()).build());

        boardRepository.save(Board.builder().title(boardTestTitle).subTitle("서브 타이틀").content("콘텐츠")
                .boardType(BoardType.free).createdDate(LocalDateTime.now()).updatedDate(LocalDateTime.now())
                .user(user).build());
    }

    @Test
    public void create_Test() {
        User user = userRepository.findByEmail(email);
        assertThat(user.getName(),is("havi"));
        assertThat(user.getPassword(), is("test"));
        assertThat(user.getEmail(),is(email));
    }

    @Test
    public void create_Test2() {
        User user = userRepository.findByEmail(email);
        Board board = boardRepository.findByUser(user);
        assertThat(board.getTitle(), is(boardTestTitle));
    }
}
