package com.example.tablemaping.Repository;

import com.example.tablemaping.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
