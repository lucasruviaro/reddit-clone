package com.lucas.redditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.redditclone.model.Comment;
import com.lucas.redditclone.model.Post;
import com.lucas.redditclone.model.User;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
    
}
