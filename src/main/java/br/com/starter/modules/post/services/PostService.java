package br.com.starter.modules.post.services;

import java.util.List;

import br.com.starter.modules.post.dtos.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

}
