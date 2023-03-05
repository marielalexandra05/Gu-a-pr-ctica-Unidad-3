package com.estudent.information.system.student.informationsystem.controller;

import com.estudent.information.system.student.informationsystem.model.Student;
import com.estudent.information.system.student.informationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping (value = "/listar")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping (value = "/{studentNumber}")
    public Student getStudentByStudentNumber (@PathVariable("studentNumber") Long studentNumber){
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping (value = "/{email}")
    public Student getStudentEmail(String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping (value = "/orderByGpa")
     public List<Student> findAllByOrderByGpaDesc(){
        return studentService.findAllByOrderGpa();
    }

    @PostMapping (value = "/")
    public ResponseEntity<?> SaveOrUpdateStudent (@RequestBody Student student){
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity("Estudiante agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{studentNumber}")
    public void deleteStudent (@PathVariable Long studentNumber){
        studentService.deleteStudent(studentService.findByStudentNumber(studentNumber).getId());
    }

}
