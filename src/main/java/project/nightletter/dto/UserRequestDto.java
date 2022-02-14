package project.nightletter.dto;

import lombok.*;
import project.nightletter.model.User;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDto {
    private String username;
    private String nickname;
    private String password;

    public User toEntity(String password){
        return User.builder()
                .nickname(nickname)
                .username(username)
                .password(password)
                .build();
    }
}
