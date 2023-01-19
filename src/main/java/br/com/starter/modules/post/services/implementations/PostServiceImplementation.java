package br.com.starter.modules.post.services.implementations;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.starter.modules.post.dtos.PostDto;
import br.com.starter.modules.post.entities.Post;
import br.com.starter.modules.post.repositories.PostRepository;
import br.com.starter.modules.post.services.PostService;

@Service
public class PostServiceImplementation implements PostService {

    private PostRepository postRepository;

    private PostDto mapToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return postDto;

    }

    private Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setCreatedAt(new Date());

        return post;
    }

    public PostServiceImplementation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = mapToEntity(postDto);

        Post newPost = postRepository.save(post);

        PostDto postResponse = mapToDto(newPost);

        return postResponse;
    }

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository.findAll();
    }

}
