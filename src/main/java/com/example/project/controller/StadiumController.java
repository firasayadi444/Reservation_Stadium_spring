package com.example.project.controller;

import com.example.project.Entity.Stadium;
import com.example.project.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    @Autowired
    private StadiumService stadiumService;

    @PostMapping("/add")
    public Stadium addStadium(@RequestBody Stadium stadium) {
        return stadiumService.addStadium(stadium);
    }

    @GetMapping("/{id}")
    public Optional<Stadium> getStadiumById(@PathVariable Long id) {
        return stadiumService.getStadiumById(id);
    }

    @GetMapping
    public List<Stadium> getAllStadiums() {
        return stadiumService.getAllStadiums();
    }

    @DeleteMapping("/{id}")
    public void deleteStadium(@PathVariable Long id) {
        stadiumService.deleteStadium(id);
    }
}

