package com.example.clientProject.service;

import com.example.clientProject.model.Client;

import java.util.List;

public interface ServiceClient {

    // создайте 4 метода:
    //  1.Создание нового клиента
    //  2.Возвращение списков всех клиентов
    //  3.Возвращение клиентов по его ID
    //  4.Удаление клиента с заданным ID

    Client addClient(Client client);

    List<Client> getAll();

    Client getById(String id);

    Client delete(String id);
}
