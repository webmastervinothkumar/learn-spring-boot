package com.webmaster.learnspringboot.jdbc.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webmaster.learnspringboot.jdbc.model.Course;

@Repository
public class CourseJdbcRepository {

    private JdbcTemplate jdbcTemplate;

    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Course course) {
        String sql = "INSERT INTO course (id, name, author, description) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, course.getId(), course.getName(), course.getAuthor(), course.getDescription());
    }

    public Course findById(long id) {
        String sql = "SELECT * FROM course WHERE id = ?";
        //return jdbcTemplate.queryForObject(sql, courseRowMapper, id);
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Course.class), id);
    }

    public void deleteById(long id) {
        String sql = "DELETE FROM course WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

}
