package com.example.teaProject.repository;

import com.example.teaProject.model.Tea;

import java.util.Set;

public interface TeaRepository {

     Set<Tea> getAll();

     Tea add(Tea tea);

     Tea getById(String uuid);
}
