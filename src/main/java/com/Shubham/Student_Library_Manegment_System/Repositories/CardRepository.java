package com.Shubham.Student_Library_Manegment_System.Repositories;

import com.Shubham.Student_Library_Manegment_System.modles.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}