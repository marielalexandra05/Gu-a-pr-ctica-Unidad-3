package com.estudent.information.system.student.informationsystem.repository;

import com.estudent.information.system.student.informationsystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByStudentNumber (long studentNumber);
    Student findByEmail(String email);
    List <Student> findAllByOrderByGpa();
}
