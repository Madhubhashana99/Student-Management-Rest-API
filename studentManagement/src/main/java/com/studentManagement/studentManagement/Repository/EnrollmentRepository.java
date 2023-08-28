package com.studentManagement.studentManagement.Repository;

import com.studentManagement.studentManagement.Model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {
    
}
