package project.nightletter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.nightletter.dto.MainResponseDto;
import project.nightletter.service.PostsService;

import java.util.List;

@RestController
public class HomeController {

    private final PostsService postsService;

    @Autowired
    public HomeController(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping("/")
    public List<MainResponseDto> letterList() {
        return postsService.getAllLetter();
    }
}
