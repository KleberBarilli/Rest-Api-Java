package br.com.starter.modules.post.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.starter.modules.post.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(long postId);
}
