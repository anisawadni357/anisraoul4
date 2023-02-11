package com.java.springBoot.minProject.miniProject.facturesRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springBoot.minProject.miniProject.entites.factures;


public interface factureRepository extends JpaRepository<factures,Long>{
	

}

