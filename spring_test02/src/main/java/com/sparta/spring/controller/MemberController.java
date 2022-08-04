package com.sparta.spring.controller;

import com.sparta.spring.dto.ResponseDto;
import com.sparta.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final UserService userService;

    @GetMapping("/api/member/login")
    public ResponseDto<?> login(){
        return ResponseDto.success("login");
    }
}
