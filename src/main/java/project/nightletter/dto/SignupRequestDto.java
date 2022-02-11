package project.nightletter.dto;

import lombok.Data;

@Data
public class SignupRequestDto {
    private String username;
    private String nickname;
    private String password;

    public SignupRequestDto(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
