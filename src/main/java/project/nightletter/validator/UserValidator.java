package project.nightletter.validator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import project.nightletter.dto.SignupRequestDto;
import project.nightletter.model.User;
import project.nightletter.repository.UserRepository;

import java.util.Optional;
import java.util.regex.Pattern;

@Component
@RequiredArgsConstructor
public class UserValidator {

    private final UserRepository userRepository;

    public void validateUserInput(SignupRequestDto signupRequestDto){
        //아이디 형식
//        String usernameValidationPatter = "^[a-zA-Z0-9]{2,}$";
//        String username = signupRequestDto.getUsername();
//        if(!(Pattern.matches(usernameValidationPatter, username))){
//            throw new IllegalArgumentException("아이디 형식 오류");
//        }
//        //비밀번호 형식
//        String passwordValidationPattern= "^[A-Za-z0-9]{6,}$";
//        String password = signupRequestDto.getPassword();
//        if(!(Pattern.matches(passwordValidationPattern,password))){
//            throw new IllegalArgumentException("비밀 번호 형식 오류");
//        }
//        //아이디 중복확인
//        Optional<User> username2 = userRepository.findByUsername(signupRequestDto.getUsername());
//        if(username2.isPresent()){
//            throw new IllegalArgumentException("닉네임이 이미 존재함");
//        }
    }

}