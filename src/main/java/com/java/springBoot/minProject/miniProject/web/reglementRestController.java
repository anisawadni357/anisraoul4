package com.java.springBoot.minProject.miniProject.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springBoot.minProject.miniProject.entites.factures;
import com.java.springBoot.minProject.miniProject.entites.reglementFacture;
import com.java.springBoot.minProject.miniProject.facturesRepositories.factureRepository;
import com.java.springBoot.minProject.miniProject.facturesRepositories.reglementRepisotery;
@RestController

public class reglementRestController {
	  @Autowired
	  private reglementRepisotery fa;
	public reglementRestController(reglementRepisotery fa)
	{
		this.fa=fa;
	}
	
	@GetMapping(path="/reglement")
	public List<reglementFacture> listFactures()
	{
		return fa.findAll();
	}
	@GetMapping(path="/reglement/{code}")
	public reglementFacture gefacturesByID(@PathVariable(name="code") long id)
	{
		return fa.findById(id).get();
	}
	@PostMapping(path="/reglement")
	public reglementFacture save(@RequestBody reglementFacture facture)
	{
		return fa.save(facture);
	}
	@PutMapping(path="/reglement/{id}")
	public reglementFacture Update(@PathVariable long id,@RequestBody reglementFacture facture)
	{
		return fa.save(facture);
	}
	@DeleteMapping(path="/reglement/{id}")
	public void delete(@PathVariable long id,@RequestBody reglementFacture facture)
	{
		
		fa.deleteById(id);
	}
}
