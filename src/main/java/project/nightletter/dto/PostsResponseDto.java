package project.nightletter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.nightletter.model.Posts;
import project.nightletter.model.Reply;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Setter
public class PostsResponseDto {

    private Long postId;

    private String nickName;

    private String content;

    private Boolean anonymous;

    private LocalDateTime localDateTime;

    private List<PostsResponseItem> replys;

}
