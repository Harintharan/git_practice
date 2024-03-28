package com.example.tablemaping.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Depatment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int department_id;
    private String department_name;

    private String department_number;

    @OneToMany(mappedBy = "depatment")

    private List<Event> events;


    @OneToMany(mappedBy = "depatment")
    private List<Lecurer> lecurers;

    @OneToMany(mappedBy = "depatment")
    private List<Module> modules;


}
