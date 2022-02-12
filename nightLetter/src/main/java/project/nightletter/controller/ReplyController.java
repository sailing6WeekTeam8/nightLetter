package project.nightletter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.nightletter.dto.ReplyRequestDto;
import project.nightletter.dto.ReplyResponseDto;
import project.nightletter.model.Reply;
import project.nightletter.model.User;
import project.nightletter.security.UserDetailsImpl;
import project.nightletter.service.ReplyService;

import java.util.List;

@RestController
public class ReplyController {

    private final ReplyService replyService;

    public ReplyController(ReplyService replyService) {
        this.replyService = replyService;
    }


    // 댓글 작성
    // 게시글 id 로 댓글 작성
    @PostMapping("/api/reply/{postId}")
    public ReplyResponseDto createReply(@PathVariable Long postId, @RequestBody ReplyRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {

       User user = userDetails.getUser();
       return replyService.createReply(postId, requestDto, user);
    }

}
