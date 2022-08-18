package com.example.new_app_spring.repository;

import com.example.new_app_spring.entity.TblClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository  extends JpaRepository<TblClass, Integer> {
    TblClass findById(Long id);
    void deleteById(Long id);
}
