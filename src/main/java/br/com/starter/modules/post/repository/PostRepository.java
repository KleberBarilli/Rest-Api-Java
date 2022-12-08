package br.com.starter.modules.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starter.modules.post.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
