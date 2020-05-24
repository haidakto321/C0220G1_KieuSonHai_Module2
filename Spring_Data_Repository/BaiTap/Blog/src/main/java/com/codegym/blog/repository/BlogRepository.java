package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitleContaining(String tittle, Pageable pageable);
    Page<Blog> findAllByCategory_Name(String name,Pageable pageable);
}
