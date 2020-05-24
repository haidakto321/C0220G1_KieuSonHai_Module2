package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById();
    }

    @Override
    public void save(Blog customer) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return null;
    }

    @Override
    public Page<Blog> findAllByName(String name, Pageable pageable) {
        return null;
    }
}
