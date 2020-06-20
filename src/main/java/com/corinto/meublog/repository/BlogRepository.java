package com.corinto.meublog.repository;

import com.corinto.meublog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Post, Long> {
}
