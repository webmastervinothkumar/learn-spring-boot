package com.webmastervino.springboot.learn_spring_boot.jpa.repository;

import org.springframework.stereotype.Repository;

import com.webmastervino.springboot.learn_spring_boot.jpa.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;    

    public void save(Course course) {
        entityManager.merge(course);
    } 

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = findById(id);
        entityManager.remove(course);
    }

}
