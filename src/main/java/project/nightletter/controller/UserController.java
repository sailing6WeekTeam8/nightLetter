//package project.nightletter.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import project.nightletter.dto.SignupRequestDto;
//import project.nightletter.security.UserDetailsImpl;
//import project.nightletter.service.UserService;
//
//@Controller
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService){this.userService = userService;}
//
//    //회원 로그인 페이지
//    @GetMapping("/user/login")
//    public boolean login() {return true;}
//
//    //에러 문구 표시
//    @GetMapping("/user/login/error")
//    public String loginError(Model model){
//        model.addAttribute("loginError", true);
//        return "login";
//    }
//
//    //회원 가입 페이지
//    @GetMapping("/user/signup")
//    public boolean signup() {return true;}
//
//    //회원 가입 요청 처리
//    @PostMapping("/user/signup")
//    public boolean registerUser(SignupRequestDto requestDto) {
//       return userService.registerUser(requestDto);
//    }
//
//    // 유저 로그인 체크
//    @GetMapping("/user/islogin")
//    public String userCheck(@AuthenticationPrincipal UserDetailsImpl userDetails) {
//        if (userDetails != null) {
//            return userDetails.getUser().getUsername();
//        }
//        return "";
//    }
//}
