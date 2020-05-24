package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
