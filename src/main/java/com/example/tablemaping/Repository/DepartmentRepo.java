package com.example.tablemaping.Repository;

import com.example.tablemaping.Entity.Depatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Depatment,Integer> {
     Depatment findByName(String name);

       Depatment deleteByName(String name);
}
