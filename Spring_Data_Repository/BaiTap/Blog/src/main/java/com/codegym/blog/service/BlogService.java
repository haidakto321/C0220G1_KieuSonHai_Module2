package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitleContaining(String tittle, Pageable pageable);
    Page<Blog> findAllByCategory_Name(String name,Pageable pageable);
}
