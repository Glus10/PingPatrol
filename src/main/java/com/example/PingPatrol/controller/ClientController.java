package com.example.PingPatrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.PingPatrol.model.Client;
import com.example.PingPatrol.service.ClientService;

@RestController                                 
@RequestMapping("/clients")
public class ClientController {

    @Autowired // This means to get the bean called clientService
    private ClientService clientService;

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping
    public Iterable<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable String id) {
        return clientService.getClientById(id);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client.getName(), client);
    }
    
}
