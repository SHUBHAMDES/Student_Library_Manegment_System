package com.Shubham.Student_Library_Manegment_System.Repositories;

import com.Shubham.Student_Library_Manegment_System.modles.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);

    //select * from student where country=India;   //Return of Entities
    List<Student> findByCountry(String country);
}