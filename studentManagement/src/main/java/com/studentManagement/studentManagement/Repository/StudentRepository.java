package com.studentManagement.studentManagement.Repository;

import com.studentManagement.studentManagement.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
