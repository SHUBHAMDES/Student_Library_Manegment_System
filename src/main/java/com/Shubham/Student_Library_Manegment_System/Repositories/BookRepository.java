package com.Shubham.Student_Library_Manegment_System.Repositories;


import com.Shubham.Student_Library_Manegment_System.modles.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}