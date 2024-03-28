package com.example.tablemaping.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Lecurer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lecture_id;

    private String lecturer_number;
    private String lecurer_name;

    /*  @OneToMany(targetEntity = Event.class,cascade = CascadeType.ALL)
      @JoinColumn(name = "LE_fk",referencedColumnName = "id")

      private List<Event> events;*/
    @OneToMany(mappedBy = "lecurer")

    private List<com.example.tablemaping.Entity.Event> events;



    @OneToMany(mappedBy = "lecurer")
    private List<Module>modules;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private com.example.tablemaping.Entity.Depatment depatment;



}
