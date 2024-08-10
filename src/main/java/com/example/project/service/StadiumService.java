package com.example.project.service;

import com.example.project.Entity.*;
import com.example.project.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StadiumService {

    @Autowired
    private StadiumRepository stadiumRepository;

    public Stadium addStadium(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    public Optional<Stadium> getStadiumById(Long id) {
        return stadiumRepository.findById(id);
    }

    public List<Stadium> getAllStadiums() {
        return stadiumRepository.findAll();
    }

    public void deleteStadium(Long id) {
        stadiumRepository.deleteById(id);
    }
}
