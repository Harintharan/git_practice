package com.example.tablemaping.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int module_id;
    private String module_name;

    private String module_number;

    @OneToMany(mappedBy = "module")

    private List<com.example.tablemaping.Entity.Event>events;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private com.example.tablemaping.Entity.Lecurer lecurer;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private com.example.tablemaping.Entity.Depatment depatment;


}
