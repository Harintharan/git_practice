package com.example.tablemaping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String student_name;
    private String index_number;

    private String student_email;


}
