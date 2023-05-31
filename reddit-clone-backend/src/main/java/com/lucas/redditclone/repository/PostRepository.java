package com.lucas.redditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.redditclone.model.Post;
import com.lucas.redditclone.model.Subreddit;
import com.lucas.redditclone.model.User;

public interface PostRepository extends JpaRepository<Post, Long>{

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
    
}
