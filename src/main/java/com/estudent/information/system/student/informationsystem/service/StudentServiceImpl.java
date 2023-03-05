package com.estudent.information.system.student.informationsystem.service;

import com.estudent.information.system.student.informationsystem.model.Student;
import com.estudent.information.system.student.informationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findByStudentNumber(long numStudent) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> findAllByOrderGpa() {
        return null;
    }

    @Override
    public void saveOrUpdateStudent(Student student) {

    }

    @Override
    public void deleteStudent(String id) {

    }
}
