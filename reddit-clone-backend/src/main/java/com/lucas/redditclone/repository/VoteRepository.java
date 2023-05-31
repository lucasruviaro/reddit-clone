package com.lucas.redditclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.redditclone.model.Post;
import com.lucas.redditclone.model.User;
import com.lucas.redditclone.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
    
}
