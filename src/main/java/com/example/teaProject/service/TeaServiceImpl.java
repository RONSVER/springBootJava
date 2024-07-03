package com.example.teaProject.service;

import com.example.teaProject.model.Tea;
import com.example.teaProject.repository.TeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class TeaServiceImpl implements TeaService {

    @Autowired
    TeaRepository teaRepository;


    @Override
    public Set<Tea> getAll() {
        return teaRepository.getAll();
    }

    @Override
    public Tea add(Tea tea) {
        return teaRepository.add(tea);
    }

    @Override
    public Tea getById(String uuid) {
        return teaRepository.getById(uuid);
    }
}
