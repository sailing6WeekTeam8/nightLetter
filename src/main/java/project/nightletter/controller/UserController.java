package project.nightletter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.nightletter.dto.SignupRequestDto;
import project.nightletter.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){this.userService = userService;}

    //회원 로그인 페이지
    @GetMapping("/user/login")
    public String login() {return "login";}

    //에러 문구 표시
    @GetMapping("/user/login/error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        return "login";
    }

    //회원 가입 페이지
    @GetMapping("/user/signup")
    public String signup() {return " signup";}

    //회원 가입 요청 처리
    @PostMapping("/user/signup")
    public String registerUser(SignupRequestDto requestDto, Model model) {
        if (userService.registerUser(requestDto).equals("")) {
            return "login";
        } else {
            model.addAttribute("errortext", userService.registerUser(requestDto));
            return "signup";
        }
    }
}
