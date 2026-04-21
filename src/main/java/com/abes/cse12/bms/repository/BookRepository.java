package com.abes.cse12.bms.repository;

import com.abes.cse12.bms.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {

}
