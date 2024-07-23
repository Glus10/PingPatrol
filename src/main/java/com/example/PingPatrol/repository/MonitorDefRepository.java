package com.example.PingPatrol.repository;

import com.example.PingPatrol.model.MonitorDef;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonitorDefRepository extends MongoRepository<MonitorDef, String> {
}
