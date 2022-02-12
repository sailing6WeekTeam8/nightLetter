package project.nightletter.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.nightletter.model.Reply;
import project.nightletter.model.User;
import project.nightletter.repository.ReplyRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ReplyController {



    // 댓글 작성
    // 게시글 id 로 댓글 작성
    @PostMapping("/api/reply/{postId}")
    public ResponseEntity<List<Reply>> createReply(@PathVariable Long postId ,@AuthenticationPrincipal UserDetailsImpl userDetail) {

        User user = userDetail.getuser();
        return createReply(postId, user);
    }




}
