package com.sparta.spring.model;


import com.sparta.spring.dto.CommentRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false)
    private String comments;

    public Comment(Long postId, Long userId, String comments){
        this.postId = postId;
        this.userId = userId;
        this.comments = comments;
    }

    public Comment(CommentRequestDto requestDto, Long userId){
        this.postId = requestDto.getPostId();
        this.userId = userId;
        this.comments = requestDto.getComments();
    }


    public void update(CommentRequestDto requestDto){
        this.comments = requestDto.getComments();
    }


}
