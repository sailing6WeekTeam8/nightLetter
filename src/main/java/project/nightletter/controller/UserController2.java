package project.nightletter.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.nightletter.dto.SignupRequestDto;
import project.nightletter.dto.UserRequestDto;
import project.nightletter.dto.UserResponseDto;
import project.nightletter.model.User;
import project.nightletter.security.UserDetailsImpl;
import project.nightletter.service.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@Controller
@Slf4j
public class UserController2 {

    private final UserService userService;

    @Autowired
    public UserController2(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/signup")
    public ResponseEntity<UserResponseDto> registerUser(@ModelAttribute UserRequestDto userRequestDto) {
        return ResponseEntity.ok().body(userService.registerUser(userRequestDto));
    }

        //회원 로그인 페이지
    @GetMapping("/user/login")
    public String login() {return "login";}

    // 에러 문구 표시
    @GetMapping("/user/login/error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @ResponseBody
    @GetMapping("/api/mains")
    public ResponseEntity login(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        User user = userDetails.getUser();
        log.info("userData: {}, {}", user.getUsername(), user.getNickname());
        return ResponseEntity.ok().body(null);

    }


}