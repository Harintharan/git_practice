package com.example.tablemaping.Entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int event_id;
    private String event_name;
    private  String event_venue;
    private LocalDate event_date;

    private LocalTime event_time;

    @ManyToOne
    @JoinColumn(name="lecture_id")

    private Lecurer lecurer;


    @ManyToOne
    @JoinColumn(name="module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private com.example.tablemaping.Entity.Depatment depatment;



}
