package com.pdf.springboot_pdf_export.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdf.springboot_pdf_export.binding.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {}