package project.nightletter.dto;

import lombok.Data;
import project.nightletter.model.Posts;
import project.nightletter.model.Reply;
import project.nightletter.model.User;

@Data
public class ReplyRequestDto {


    private String comment;
    private boolean anonymous;






}




