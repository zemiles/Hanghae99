package com.sparta.spring.controller;


import com.sparta.spring.dto.PostRequestDto;
import com.sparta.spring.dto.ResponseDto;
import com.sparta.spring.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/api/auth/post")
    public ResponseDto<?> createPost(@RequestBody PostRequestDto requestDto){
        return postService.createPost(requestDto);
    }

    @GetMapping("/api/post/{id}")
    public  ResponseDto<?> getPost(@PathVariable Long id){
        return postService.getPost(id);
    }

    @GetMapping("/api/post")
    public ResponseDto<?> getAllPost(){
        return postService.getAllpost();
    }

    @PutMapping("/api/auth/post/{id}")
    public ResponseDto<?> updatePost(@PathVariable Long id,@RequestBody PostRequestDto requestDto){
        return postService.updatePost(id,requestDto);
    }

    @DeleteMapping("/api/auth/post/{id}")
    public ResponseDto<?> deletePost(@PathVariable Long id){
        return postService.deletePost(id);
    }
}