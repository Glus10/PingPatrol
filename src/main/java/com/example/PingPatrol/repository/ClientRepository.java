package com.example.PingPatrol.repository;

import com.example.PingPatrol.model.Client; 
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClientRepository extends MongoRepository<Client, String> {
    List<Client> findByName(String name);
    List<Client> findByLocation(String location);
    List<Client> findByMonitorInterval(long monitorInterval);
}
