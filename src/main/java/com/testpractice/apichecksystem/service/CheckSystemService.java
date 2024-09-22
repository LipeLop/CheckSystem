package com.testpractice.apichecksystem.service;

import com.testpractice.apichecksystem.models.CheckSystem;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Service
public class CheckSystemService {

    public List<CheckSystem> getAllSystems() {
        List<CheckSystem> systems = new ArrayList<>();
        return systems;
    }

    public Boolean checkSystemAvailability(String id) {
        return null;
    }

    public Time getApproximateCheckTime(String id, boolean isFastCheck) {
        return null;
    }
}
