package com.java.springBoot.minProject.miniProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.springBoot.minProject.miniProject.entites.factures;
import com.java.springBoot.minProject.miniProject.entites.facturesProductClient;
import com.java.springBoot.minProject.miniProject.entites.reglementFacture;
import com.java.springBoot.minProject.miniProject.facturesRepositories.factureRepository;
import com.java.springBoot.minProject.miniProject.facturesRepositories.facturesProductClientRepository;
import com.java.springBoot.minProject.miniProject.facturesRepositories.reglementRepisotery;


@SpringBootApplication
public class MiniProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MiniProjectApplication.class, args);
		System.out.println("success");
	}
	@Bean
	CommandLineRunner start(facturesProductClientRepository fa)
	{
		return arg -> {
				fa.save(new facturesProductClient(1,1,1,1,1,1));
				System.out.println("success");
		};
	}

}
