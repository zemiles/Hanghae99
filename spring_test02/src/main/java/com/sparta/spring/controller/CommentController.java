package com.sparta.spring.controller;

import com.sparta.spring.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

//    @PostMapping("/api/auth/comment")
//    public ResponseDto<?> creatComment(@RequestBody CommentRequestDto requestDto){
////        return commentService.createComment(requestDto,id);
//    }
}
