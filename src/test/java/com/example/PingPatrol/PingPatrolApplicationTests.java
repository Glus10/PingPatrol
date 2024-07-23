package com.example.PingPatrol;

import com.example.PingPatrol.model.Client;
import com.example.PingPatrol.service.ClientService;
import com.example.PingPatrol.service.HealthyService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PingPatrolApplicationTests {

	@Autowired
	ClientService clientService;

	@Autowired
	HealthyService healthyService;

	@Test
	void contextLoads() {
	}

	@Test
	void testStam() {
		System.out.println("stam");
	}

	@Test
	void testCreateClient() {
		// Add initial clients
		Client test = new Client("test1234", "http://walla.co.il", "yair@gluska.com", "123-456-7890",
				"123 Client St, Client City, CL 12345", "Client City", "First client description", 60000);
		clientService.createClient(test);
		Client client = clientService.getClientById("test1234");
		Assertions.assertEquals(test.getName(), client.getName());
		clientService.deleteClient("test1234");
	}

	@Test
	void testIsHealthy() {
		Boolean a = healthyService.isHealthy("https://www.ynet.co.il");
		Boolean b = healthyService.isHealthy("http://stam.co.il");

		Assertions.assertEquals(true, a);
		Assertions.assertEquals(false, b);
	}
}
