package com.example.PingPatrol.service;

import com.example.PingPatrol.model.Client;
import com.example.PingPatrol.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client) {
        if (clientRepository.findByName(client.getName()).size() > 0) {
            return null;
        }
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client updateClient(String id, Client client) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setUrl(client.getUrl());
        existingClient.setEmail(client.getEmail());
        existingClient.setPhone(client.getPhone());
        existingClient.setAddress(client.getAddress());
        existingClient.setLocation(client.getLocation());
        existingClient.setDescription(client.getDescription());
        existingClient.setMonitorInterval(client.getMonitorInterval());
        return clientRepository.save(existingClient);
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }






}