package br.com.starter.modules.post.services;

import java.util.List;

import br.com.starter.modules.post.dtos.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);
}
