package com.pdf.springboot_pdf_export.Service;

import java.util.List;

import com.pdf.springboot_pdf_export.binding.Student;

public interface StudentService {

void addStudent(Student student);
List<Student> getStudentList();

}