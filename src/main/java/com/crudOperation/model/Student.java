package com.crudOperation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;
@Data
@Entity(name = "students")
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id",nullable = false)
    private Long id;
    @Column(name = "name",nullable = false)
    private String studentName;
    @Column(name = "father_name",nullable = false)
    private String fatherName;
    @Column(name = "contact_no",nullable = false)
    private String contactNumber;
    @Column(name = "dob",nullable = false)
    private Date dob;
    @Column(name = "address" ,nullable = false)
    private String address;
    @Column(name = "standard",nullable = false)
    private int standard;
}
