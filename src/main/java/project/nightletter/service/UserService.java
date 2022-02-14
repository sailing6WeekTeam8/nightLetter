package project.nightletter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.nightletter.dto.UserRequestDto;
import project.nightletter.dto.UserResponseDto;
import project.nightletter.model.User;
import project.nightletter.repository.UserRepository;
import project.nightletter.security.UserDetailsImpl;
import project.nightletter.validator.SignupValidator;

import javax.transaction.Transactional;

@Service
@Slf4j
public class UserService {
//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    public boolean registerUser(SignupRequestDto requestDto) {
//        // 회원 ID 중복 확인
//        String username = requestDto.getUsername();
//        Optional<User> found = userRepository.findByUsername(username);
//        if (found.isPresent()) {
////            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
//            return false;
//        }else {
//
//// 패스워드 암호화
//            String password = passwordEncoder.encode(requestDto.getPassword());
//            String nickname = requestDto.getNickname();
//
//
//            log.info("username={}", username);
//            log.info("username={}", password);
//            log.info("username={}", nickname);
//            User user = new User(username, password, nickname);
//            userRepository.save(user);
//            return true;
//        }
//    }
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Transactional
    public UserResponseDto registerUser(UserRequestDto userRequestDto) {

        SignupValidator.signupValidator(userRequestDto);

        String password = passwordEncoder.encode(userRequestDto.getPassword());
        User user = userRepository.save(userRequestDto.toEntity(password));
        return user.toResponseDto();
    }

    public UserResponseDto getUser(UserDetailsImpl userDetails) {
        return UserResponseDto.builder()
                .username(userDetails.getUsername())
                .nickname(userDetails.getUser().getNickname())
                .build();
    }
}
