package com.webmastervino.springboot.learn_spring_boot.springdatajpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webmastervino.springboot.learn_spring_boot.jpa.model.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
