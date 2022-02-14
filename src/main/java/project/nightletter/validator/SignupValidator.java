package project.nightletter.validator;

import project.nightletter.dto.UserRequestDto;

public class SignupValidator {
    public static void signupValidator(UserRequestDto userRequestDto) {
        if (!userRequestDto.getUsername().matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$")) {
            throw new IllegalArgumentException("아이디는 email 형식으로 작성가능합니다.");
        }

        if (!userRequestDto.getNickname().matches("^[A-Za-z\\d]{3,}$")) {
            throw new IllegalArgumentException("아이디는 3자 이상 대소문자와 숫자만 사용가능합니다");
        }

        if (!userRequestDto.getPassword().matches("^[A-Za-z\\d]{8,}$")) {
            throw new IllegalArgumentException("비밀번호는 8자 이상 대소문자와 숫자만 사용가능합니다.");
        }

    }
}
