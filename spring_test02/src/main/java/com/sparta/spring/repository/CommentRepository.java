package com.sparta.spring.repository;

import com.sparta.spring.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
        List<Comment> findAllByPostId(Long postId);
        List<Comment> findAllByPostIdOrderByModifiedAtDesc(Long postId);

}
