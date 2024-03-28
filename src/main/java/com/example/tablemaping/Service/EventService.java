package com.example.tablemaping.Service;

import com.example.tablemaping.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EventService {
    @Autowired
    private EventRepo eventRepo;
}
