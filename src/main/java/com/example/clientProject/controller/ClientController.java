package com.example.clientProject.controller;


import com.example.clientProject.model.Client;
import com.example.clientProject.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ServiceClient ServiceClient;

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return ServiceClient.addClient(client);
    }

    @GetMapping
    public List<Client> getAll() {
        return ServiceClient.getAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable String id) {
        return ServiceClient.getById(id);
    }

    @DeleteMapping("/{id}")
    public Client delete(@PathVariable String id) {
        return ServiceClient.delete(id);
    }
}
