package com.sparta.spring.service;

import com.sparta.spring.dto.PostRequestDto;
import com.sparta.spring.dto.ResponseDto;
import com.sparta.spring.model.Post;
import com.sparta.spring.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public ResponseDto<?> createPost(PostRequestDto requestDto){
        Post post = new Post(requestDto);

        postRepository.save(post);

        return ResponseDto.success(post);
    }

    @Transactional(readOnly = true)
    public ResponseDto<?> getPost(Long id){
        Optional<Post> optionalPost = postRepository.findById(id);

        if(optionalPost.isEmpty()){
            return ResponseDto.fail("NULL_POST_ID","ID가 없습니다");
        }

        return ResponseDto.success(optionalPost.get());
    }

    @Transactional(readOnly = true)
    public ResponseDto<?> getAllpost(){
        return ResponseDto.success(postRepository.findAllByOrderByCreatedAtDesc());
    }

    @Transactional(readOnly = false)
    public ResponseDto<Post> updatePost(Long id, PostRequestDto requestDto){
        Optional<Post> optionalPost = postRepository.findById(id);

        if(optionalPost.isEmpty()){
            return ResponseDto.fail("NULL_POST_ID","ID가 없습니다.");
        }
        Post p = optionalPost.get();
        p.update(requestDto);

        return ResponseDto.success(p);
    }

    @Transactional
    public ResponseDto<?> deletePost(Long id){
        Optional<Post> optionalPost = postRepository.findById(id);
        if(optionalPost.isEmpty()){
            return ResponseDto.fail("NULL_POST_ID","ID가 없습니다");
        }
        Post p = optionalPost.get();
        postRepository.delete(p);

        return ResponseDto.success(true);
    }

}
