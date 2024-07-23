package com.example.PingPatrol;

import com.example.PingPatrol.model.Client;
import com.example.PingPatrol.repository.ClientRepository;
import com.example.PingPatrol.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PingPatrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPatrolApplication.class, args);
	}

	@Autowired
	private ClientService clientService;





// This method is used to initialize the database with some initial clients.


@Bean
CommandLineRunner initDatabase() {
	return args -> {

		// Add initial clients
		Client walla = new Client("walla", "http://walla.co.il", "yair@gluska.com", "123-456-7890",
				"123 Client St, Client City, CL 12345", "Client City", "First client description", 60000);

		clientService.createClient(walla);


		// Print all clients
		System.out.println("Initial clients:");
		clientService.getAllClients().forEach(System.out::println);
		};
	}
}
