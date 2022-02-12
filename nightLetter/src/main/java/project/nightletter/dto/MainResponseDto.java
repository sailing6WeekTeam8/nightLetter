package project.nightletter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class MainResponseDto {

    private Long postId;

    private String nickName;

    private String content;

    private Boolean anonymous;

    private LocalDateTime localDateTime;

    private int replyCount;

}
