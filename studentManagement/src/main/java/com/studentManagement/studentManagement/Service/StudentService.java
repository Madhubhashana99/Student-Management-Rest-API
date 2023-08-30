package com.studentManagement.studentManagement.Service;

import com.studentManagement.studentManagement.Model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);

}
