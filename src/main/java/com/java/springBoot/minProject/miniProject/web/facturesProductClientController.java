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

import com.java.springBoot.minProject.miniProject.facturesRepositories.factureRepository;
import com.java.springBoot.minProject.miniProject.facturesRepositories.facturesProductClientRepository;
import com.java.springBoot.minProject.miniProject.entites.factures;
import com.java.springBoot.minProject.miniProject.entites.facturesProductClient;
@RestController
public class facturesProductClientController {
	  @Autowired
	  private facturesProductClientRepository fa;
	public facturesProductClientController(facturesProductClientRepository fa)
	{
		this.fa=fa;
	}
	
	@GetMapping(path="/facturesproductclient")
	public List<facturesProductClient> listFactures()
	{
		return fa.findAll();
	}
	@GetMapping(path="/facturesproductclient/{code}")
	public facturesProductClient gefacturesByID(@PathVariable(name="code") long id)
	{
		return fa.findById(id).get();
	}
	@PostMapping(path="/facturesproductclient")
	public facturesProductClient save(@RequestBody facturesProductClient facture)
	{
		return fa.save(facture);
	}
	@PutMapping(path="/facturesproductclient/{id}")
	public facturesProductClient Update(@PathVariable long id,@RequestBody facturesProductClient facture)
	{
		return fa.save(facture);
	}
	@DeleteMapping(path="/facturesproductclient/{id}")
	public void delete(@PathVariable long id,@RequestBody factures facture)
	{
		
		fa.deleteById(id);
	}
  
}