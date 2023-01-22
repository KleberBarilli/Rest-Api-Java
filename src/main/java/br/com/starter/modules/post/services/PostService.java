package br.com.starter.modules.post.services;

import br.com.starter.modules.post.dtos.PostDto;
import br.com.starter.modules.post.dtos.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageSize, int pageNumber, String sortBy, String order);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

}
