package com.example.clientProject.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Client {

    // Создайте клиента с полями id, name, email и phone.

    private String id;

    private String name;

    private String email;

    private String phone;

    public Client(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Client(String name, String email, String phone) {
        this(UUID.randomUUID().toString(), name, email, phone);
    }

    public Client() {

    }
}
