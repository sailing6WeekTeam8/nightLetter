package project.nightletter.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.nightletter.dto.SignupRequestDto;
import project.nightletter.model.User;
import project.nightletter.repository.UserRepository;

import java.util.Optional;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public String registerUser(SignupRequestDto requestDto) {
        String error = "";
        String username = requestDto.getUsername();
        String password = requestDto.getPassword();
        String nickname = requestDto.getNickname();

        // 회원 ID 중복 확인
        Optional<User> found = userRepository.findByUsername(username);

        String pattern = "^[a-zA-Z0-9]*$";

        if (found.isPresent()) {
            return "중복된 id 입니다.";
        }

        if (username.length() < 3) {
            return "닉네임을 3자 이상 입력하세요";
        } else if (!Pattern.matches(pattern, username)) {
            return "알파벳 대소문자와 숫자로만 입력하세요";
        } else if (password.length() < 4) {
            return "비밀번호를 4자 이상 입력하세요";
        } else if (password.contains(username)) {
            return "비밀번호에 닉네임을 포함할 수 없습니다.";
        }
        // 패스워드 인코딩
        password = passwordEncoder.encode(password);
        requestDto.setPassword(password);

        User user = new User(username, password, nickname);
        userRepository.save(user);
        return error;
    }
}
