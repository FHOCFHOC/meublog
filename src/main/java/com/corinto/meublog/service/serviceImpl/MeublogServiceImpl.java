package com.corinto.meublog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.corinto.meublog.model.Post;
import com.corinto.meublog.repository.BlogRepository;
import com.corinto.meublog.service.MeublogService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MeublogServiceImpl implements MeublogService{

	@Autowired
	BlogRepository blogRepository;
	
	@Override
    public List<Post> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

//    private Sort sortByIdAsc() {
//        return new Sort(Sort.Direction.DESC, "id");
//    }

}
