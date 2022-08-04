package com.sparta.spring.service;

import com.sparta.spring.dto.CommentRequestDto;
import com.sparta.spring.dto.ResponseDto;
import com.sparta.spring.model.Comment;
import com.sparta.spring.repository.CommentRepository;
import com.sparta.spring.repository.UserRepository;
import com.sparta.spring.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    @Transactional
    public ResponseDto<?> createComment(CommentRequestDto commentRequestDto, UserDetailsImpl userDetails){
        Long userId = userDetails.getMember().getId();
        Comment comment = new Comment(commentRequestDto,userId);
        commentRepository.save(comment);
        return ResponseDto.success(comment);
    }

    @Transactional(readOnly = true)
    public ResponseDto<?> getCommentAll(Long id){
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if(optionalComment.isPresent()){
            return ResponseDto.fail("NULL_USER_ID","아이디가 잘못되었습니다");
        }

        return ResponseDto.success(commentRepository.findAllByPostIdOrderByModifiedAtDesc(id));
    }

    @Transactional(readOnly = true)
    public ResponseDto<?> updateComment(Long id, CommentRequestDto requestDto){
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if(optionalComment.isEmpty()){
            return ResponseDto.fail("NULL_USER_ID","아이디가 없습니다.");
        }
        Comment c = optionalComment.get();
        c.update(requestDto);
        return ResponseDto.success(c);
    }

    @Transactional
    public ResponseDto<?> deleteComment(Long id){
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if(optionalComment.isEmpty()){
            return ResponseDto.fail("NULL_USER_ID","아이디가 없습니다.");
        }
        Comment c = optionalComment.get();
        commentRepository.delete(c);
        return ResponseDto.success(true);
    }
}