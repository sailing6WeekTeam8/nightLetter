package project.nightletter.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.nightletter.security.UserDetailsImpl;

@Controller
public class HomeController {
    //security 가 전달하는 userDetailsImpl 이다.
    @GetMapping("/index.html")
    public String home(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        if (userDetails != null) {
            model.addAttribute("username",userDetails.getUsername());
        }
        return "index";
    }
}
