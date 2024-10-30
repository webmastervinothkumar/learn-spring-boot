package com.webmaster.learnspringboot.springdatajpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webmaster.learnspringboot.jpa.model.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
