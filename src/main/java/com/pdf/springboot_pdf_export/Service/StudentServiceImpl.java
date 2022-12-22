package com.pdf.springboot_pdf_export.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdf.springboot_pdf_export.Repository.StudentRepository;
import com.pdf.springboot_pdf_export.binding.Student;


@Service
public class StudentServiceImpl implements StudentService {

@Autowired
StudentRepository studentRepo;

@Override
public void addStudent(Student student) {

studentRepo.save(student);

}

@Override
public List<Student> getStudentList() {

return studentRepo.findAll();

}
}