package com.anish.sms.service;

import com.anish.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();


    void createStudent(StudentDto student);
}
