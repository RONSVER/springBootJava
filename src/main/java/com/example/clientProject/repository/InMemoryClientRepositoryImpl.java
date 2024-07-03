package com.example.clientProject.repository;

import com.example.clientProject.model.Client;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryClientRepositoryImpl implements ClientRepository {

    Map<String, Client> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        Client clientOne = new Client("Vasya", "Vasya@gmail.com", "+3333333333");
        Client clientTwo = new Client("Petya", "Petya@gmail.com", "+4444444444");
        Client clientThree = new Client("Kiril", "Kiril@gmail.com", "+5555555555");

        storage.put(clientOne.getId(), clientOne);
        storage.put(clientTwo.getId(), clientTwo);
        storage.put(clientThree.getId(), clientThree);
    }

    @Override
    public Client addClient(Client client) {
        Client newClient = new Client(client.getId(), client.getName(), client.getEmail(), client.getPhone());
        storage.put(newClient.getId(), newClient);
        return newClient;
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Client getById(String id) {
        return storage.get(id);
    }

    @Override
    public Client delete(String id) {
        return storage.remove(id);
    }
}
