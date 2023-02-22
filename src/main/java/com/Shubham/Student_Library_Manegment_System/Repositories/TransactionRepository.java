package com.Shubham.Student_Library_Manegment_System.Repositories;

import com.Shubham.Student_Library_Manegment_System.modles.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer> {


    @Query(value = "select * from transactions where book_id=:bookId and card_id=:cardId and is_issue_operation=true",
            nativeQuery = true)
    List<Transactions> getTransactionsForBookAndCard(int bookId, int cardId);

}