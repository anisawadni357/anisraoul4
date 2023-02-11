package com.java.springBoot.minProject.miniProject.facturesRepositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springBoot.minProject.miniProject.entites.facturesProductClient;
import com.java.springBoot.minProject.miniProject.entites.reglementFacture;
public interface facturesProductClientRepository extends JpaRepository<facturesProductClient,Long> {
    
}
