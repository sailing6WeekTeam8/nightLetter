//package project.nightletter;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import project.nightletter.dto.SignupRequestDto;
//import project.nightletter.repository.UserRepository;
//import project.nightletter.service.UserService;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//class UserServiceTest {
//    @InjectMocks
//    private UserService userService;
//
//    @Mock
//    UserRepository userRepository;
//
//    @Test
//    @DisplayName("userName 글자수 체크")
//    void usernameLengthChk() {
//
//        // given
//        String username = "te";
//        String password = "password";
//        String nickname = "nickname";
//
//
//        SignupRequestDto signupRequestDto = new SignupRequestDto(username, password, nickname);
//
//        // when
////        String result = userService.registerUser(signupRequestDto);
//
//        // then
//        assertEquals("닉네임을 3자 이상 입력하세요", result);
//    }
//
//    @Test
//    @DisplayName("userName 특수문자 체크")
//    void usernameChk() {
//
//        // given
//        String username = "<>@#";
//        String password = "password";
//        String nickname = "nickname";
//
//
//        SignupRequestDto signupRequestDto = new SignupRequestDto(
//                username, password, nickname
//        );
//
//        // when
////        String result = userService.registerUser(signupRequestDto);
//
//        // then
//        assertEquals("알파벳 대소문자와 숫자로만 입력하세요", result);
//    }
//
//    @Test
//    @DisplayName("password 글자수 체크")
//    void passwordLengthChk() {
//
//        // given
//        String username = "test";
//        String password = "tes";
//        String nickname = "nickname";
//
//
//        SignupRequestDto signupRequestDto = new SignupRequestDto(
//                username, password, nickname
//        );
//
//        // when
////        String result = userService.registerUser(signupRequestDto);
//
//        // then
//        assertEquals("비밀번호를 4자 이상 입력하세요", result);
//    }
//
//    @Test
//    @DisplayName("password 에 username 포함된경우")
//    void passwordUsernameChk() {
//
//        // given
//        String username = "test";
//        String password = "test";
//        String nickname = "nickname";
//
//
//        SignupRequestDto signupRequestDto = new SignupRequestDto(
//                username, password, nickname
//        );
//
//        // when
////        String result = userService.registerUser(signupRequestDto);
//
//        // then
////        assertEquals("비밀번호에 닉네임을 포함할 수 없습니다.", result);
//    }
//
//    @Test
//    @DisplayName("회원 등록")
//    void resisterTest(){
//        //given
//        String username = "test";
//        String password = "test";
//        String nickname = "nickname";
//        //when
//        //then
//    }
//}