package com.codegym.services;

import com.codegym.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    void save(Student student);

    Student findById(Integer id);

    Page<Student> findAll(Pageable pageable);

    Page<Student> findAllByName(String name, Pageable pageable);
}
