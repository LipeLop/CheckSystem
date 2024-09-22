package com.testpractice.apichecksystem.contoller;

import com.testpractice.apichecksystem.models.CheckSystem;
import com.testpractice.apichecksystem.service.CheckSystemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.List;

@RestController("/api/check-systems")
public class CheckSystemController {

    //TODO Сервис нужно сделать
    private final CheckSystemService checkSystemService;

    public CheckSystemController(CheckSystemService checkSystemService) {
        this.checkSystemService = checkSystemService;
    }

    @GetMapping
    public List<CheckSystem> getAllSystems() {
        return checkSystemService.getAllSystems();
    }
    @GetMapping("/{id}/availability")
    public Boolean checkSystemAvailability(@PathVariable String id) {
        return checkSystemService.checkSystemAvailability(id);
    }
    @GetMapping("/{id}/approximateCheckTime")
    public Time getApproximateCheckTime(@PathVariable String id, @RequestParam boolean isFastCheck) {
        return checkSystemService.getApproximateCheckTime(id, isFastCheck);
    }
}
