package com.example.teaProject.service;

import com.example.teaProject.model.Tea;

import java.util.Set;

public interface TeaService {

    Set<Tea> getAll();

    Tea add(Tea tea);

    Tea getById(String uuid);
}
