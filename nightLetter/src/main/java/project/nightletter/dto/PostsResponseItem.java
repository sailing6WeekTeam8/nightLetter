package project.nightletter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import project.nightletter.model.Reply;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PostsResponseItem {

    private Long commentId;

    private String nickname;

    private String comment;

    private LocalDateTime localDateTime;

    private boolean anonymous;

}
