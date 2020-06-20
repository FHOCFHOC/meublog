package com.corinto.meublog.service;

import java.util.List;

import com.corinto.meublog.model.Post;

public interface MeublogService {

	List<Post> findAll();
    Post findById(long id);
    Post save(Post post);	
	
}
