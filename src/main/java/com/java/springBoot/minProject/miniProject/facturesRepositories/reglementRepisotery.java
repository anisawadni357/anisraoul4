package com.java.springBoot.minProject.miniProject.facturesRepositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springBoot.minProject.miniProject.entites.reglementFacture;
public interface reglementRepisotery extends JpaRepository<reglementFacture,Long> {
    
}
