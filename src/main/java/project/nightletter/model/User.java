package project.nightletter.model;

import lombok.*;
import project.nightletter.dto.SignupRequestDto;
import project.nightletter.dto.UserResponseDto;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class User extends BaseTimeEntity{

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    public UserResponseDto toResponseDto(){
        return UserResponseDto.builder()
                .username(username)
                .nickname(nickname)
                .build();
    }
}
