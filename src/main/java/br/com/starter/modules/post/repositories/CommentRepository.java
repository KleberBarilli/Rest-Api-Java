package br.com.starter.modules.post.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starter.modules.post.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
