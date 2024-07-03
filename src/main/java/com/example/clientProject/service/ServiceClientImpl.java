package com.example.clientProject.service;

import com.example.clientProject.model.Client;
import com.example.clientProject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.addClient(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    @Override
    public Client getById(String id) {
        return clientRepository.getById(id);
    }

    @Override
    public Client delete(String id) {
        return clientRepository.delete(id);
    }
}
