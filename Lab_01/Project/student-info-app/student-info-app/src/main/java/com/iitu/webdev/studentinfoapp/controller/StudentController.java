package com.iitu.webdev.studentinfoapp.controller;

import com.iitu.webdev.studentinfoapp.model.Student;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private Map<String, Student> students = new HashMap<>();

    public StudentController() {
        students.put("S001", new Student("S001","Alice Johnson","alice@iitu.edu.kz","Computer Science"));
        students.put("S002", new Student("S002","Bob Smith","bob@iitu.edu.kz","Software Engineering"));
    }

    // GET /students
    @GetMapping
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    // GET /students/S001
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return students.get(id);
    }

    // POST /students
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        students.put(student.getId(), student);
        return student;
    }

    // test endpoint
    @GetMapping("/health")
    public String health() {
        return "Student API is running!";
    }
}
