package project.nightletter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.nightletter.dto.PostsRequestDto;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class Posts extends BaseTimeEntity {

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private boolean anonymous;

    @JoinColumn(name = "username_id")
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "reply_id")
    private List<Reply> reply;

    public Posts(PostsRequestDto requestDto, User user) {
        this.comment = requestDto.getComment();
        this.anonymous = requestDto.isAnonymous();
        this.user = user;
    }

}
