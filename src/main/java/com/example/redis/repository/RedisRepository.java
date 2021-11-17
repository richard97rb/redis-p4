package com.example.redis.repository;

import com.example.redis.domain.Student;

import java.util.Map;

public interface RedisRepository {
    Map<String, Student> findAll();
    Student findById(String id);
    void save(Student student);
    void delete(String id);
}
