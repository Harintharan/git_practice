package com.example.tablemaping.Service;

import com.example.tablemaping.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
private StudentRepo studentRepo;
}
