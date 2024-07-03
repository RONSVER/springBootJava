package com.example.teaProject.repository;

import com.example.teaProject.model.Tea;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class InMemoryTeaRepositoryImpl implements TeaRepository {

    Map<String, Tea> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        Tea tea_ganador = new Tea("Tea Ganador");
        Tea tea_cereza = new Tea("Tea Cereza");
        Tea tea_lareno = new Tea("Tea Lareno");
        Tea tea_tres_pontas = new Tea("Tea Tres Pontas");

        storage.put(tea_ganador.getId(), tea_ganador);
        storage.put(tea_cereza.getId(), tea_cereza);
        storage.put(tea_lareno.getId(), tea_lareno);
        storage.put(tea_tres_pontas.getId(), tea_tres_pontas);
    }

    @Override
    public Set<Tea> getAll() {
        return new HashSet<>(storage.values());
    }

    @Override
    public Tea add(Tea tea) {
        Tea newTea = new Tea(tea.getName());
        storage.put(newTea.getId(), newTea);
        return newTea;
    }

    @Override
    public Tea getById(String uuid) {
        return storage.get(uuid);
    }
}
