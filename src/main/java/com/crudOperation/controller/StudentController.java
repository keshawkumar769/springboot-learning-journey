package com.crudOperation.controller;

import com.crudOperation.model.Student;
import com.crudOperation.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.replaceStudentData(id, student));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Student> patchStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.patchStudentData(id, student));
    }
}
