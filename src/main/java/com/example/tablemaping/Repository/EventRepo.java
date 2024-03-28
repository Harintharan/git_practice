package com.example.tablemaping.Repository;

import com.example.tablemaping.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event,Integer> {
}
