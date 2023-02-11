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


import com.java.springBoot.minProject.miniProject.entites.factures;
@RestController
public class facturesRestController {
	  @Autowired
	  private factureRepository fa;
	public facturesRestController(factureRepository fa)
	{
		this.fa=fa;
	}
	@RequestMapping("/")
     public String home(){
         return "anis awadni";
     }
	@GetMapping(path="/factures")
	public List<factures> listFactures()
	{
		return fa.findAll();
	}
	@GetMapping(path="/factures/{code}")
	public factures gefacturesByID(@PathVariable(name="code") long id)
	{
		return fa.findById(id).get();
	}
	@PostMapping(path="/factures")
	public factures save(@RequestBody factures facture)
	{
		return fa.save(facture);
	}
	@PutMapping(path="/factures/{id}")
	public factures Update(@PathVariable long id,@RequestBody factures facture)
	{
		return fa.save(facture);
	}
	@DeleteMapping(path="/factures/{id}")
	public void delete(@PathVariable long id,@RequestBody factures facture)
	{
		
		fa.deleteById(id);
	}
  
}
