package project.nightletter.dto;

import lombok.Data;

@Data
public class PostsRequestDto {
    private String comment;
    private boolean anonymous;

}
