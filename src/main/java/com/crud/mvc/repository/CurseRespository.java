package com.crud.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.mvc.model.Course;

@Repository
public interface CurseRespository extends JpaRepository<Course, Long> {

}
