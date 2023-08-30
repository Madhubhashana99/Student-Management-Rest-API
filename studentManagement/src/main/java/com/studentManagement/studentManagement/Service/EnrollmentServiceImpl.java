package com.studentManagement.studentManagement.Service;

import com.studentManagement.studentManagement.Model.Enrollment;
import com.studentManagement.studentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Enrollment> getAllEnrollments() {
        return null;
    }

    @Override
    public Enrollment getEnrollmentById(Long id) {
        return null;
    }

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        return null;
    }

    @Override
    public Enrollment updateEnrollment(Long id, Enrollment enrollment) {
        return null;
    }

    @Override
    public void deleteEnrollment(Long id) {

    }
}
