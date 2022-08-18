package com.example.new_app_spring.repository;

import com.example.new_app_spring.entity.TblStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<TblStudent, Integer> {
}
