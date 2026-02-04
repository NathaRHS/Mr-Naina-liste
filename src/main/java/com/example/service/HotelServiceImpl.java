package com.example.service;

import com.example.entity.Hotel;
import com.example.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository repo;

    public HotelServiceImpl(HotelRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Hotel> findAll() {
        
        return repo.findAll();
    }
}
