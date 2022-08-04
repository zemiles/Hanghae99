package com.sparta.spring.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long postId;
    private String comments;
}
