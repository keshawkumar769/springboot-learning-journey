package com.crudOperation.service;

import com.crudOperation.model.Student;
import com.crudOperation.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return null;
    }

    public Student replaceStudentData(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    public Student patchStudentData(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        if (student.getStudentName() != null) {
            existingStudent.setStudentName(student.getStudentName());
        }
        if (student.getFatherName() != null) {
            existingStudent.setFatherName(student.getFatherName());
        }
        if (student.getAddress() != null) {
            existingStudent.setAddress(student.getAddress());
        }
        if (student.getContactNumber()!= null) {
            existingStudent.setContactNumber(student.getContactNumber());
        }
        if (student.getDob() != null) {
            existingStudent.setDob(student.getDob());
        }
        if(student.getStandard() != 0) {
            existingStudent.setStandard(student.getStandard());
        }
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
}
