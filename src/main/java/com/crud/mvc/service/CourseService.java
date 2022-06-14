package com.crud.mvc.service;

import com.crud.mvc.model.Course;
import java.util.List;
import org.springframework.data.domain.Page;

public interface CourseService {

	List<Course> getAllCourses();

	void saveCourseById(Course course);

	Course getCourseById(long id);

	void deleteCourseById(long id);

	Page<Course> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection);

}
