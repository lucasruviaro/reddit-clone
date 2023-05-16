package com.lucas.redditclone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lucas.redditclone.dto.CommentDto;
import com.lucas.redditclone.model.Comment;
import com.lucas.redditclone.model.Post;
import com.lucas.redditclone.model.User;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "text", source = "commentsDto.text")
    @Mapping(target = "createdTime", expression = "java(java.time.Instant.now())")
    @Mapping(target = "post", source = "post")
    @Mapping(target = "user", source = "user")
    Comment map(CommentDto commentsDto, Post post, User user);

    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    CommentDto mapToDto(Comment comment);
}