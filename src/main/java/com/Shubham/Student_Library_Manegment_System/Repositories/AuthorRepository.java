package com.Shubham.Student_Library_Manegment_System.Repositories;

import com.Shubham.Student_Library_Manegment_System.modles.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {


}