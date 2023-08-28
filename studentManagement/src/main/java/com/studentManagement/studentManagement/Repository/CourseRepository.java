package com.studentManagement.studentManagement.Repository;

import com.studentManagement.studentManagement.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
