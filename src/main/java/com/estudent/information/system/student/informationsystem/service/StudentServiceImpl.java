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
        return studentRepository.findAll();
    }

    @Override
    public Student findByStudentNumber(long numStudent) {
        return studentRepository.findByStudentNumber(numStudent);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Student> findAllByOrderGpa() {
        return studentRepository.findAllByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
studentRepository.deleteById(id);
    }
}
