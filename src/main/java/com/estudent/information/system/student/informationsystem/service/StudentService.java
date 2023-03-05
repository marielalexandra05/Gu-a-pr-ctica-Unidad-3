package com.estudent.information.system.student.informationsystem.service;

import com.estudent.information.system.student.informationsystem.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student findByStudentNumber(long numStudent);
    public  Student findByEmail(String email);
    public List<Student> findAllByOrderGpa();
    public void saveOrUpdateStudent (Student student);
    public void deleteStudent (String id);
}
