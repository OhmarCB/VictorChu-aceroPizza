package com.idat.pe.EFEFVICTORCHUMACEROPIZZA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.entity.Pizza;
import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.repository.PizzaRepository;

@Service

public class PizaServiceImpl implements PizzaService{
@Autowired
private PizzaRepository repository;
	@Override
	public List<Pizza> listarPizza() {
		return repository.findAll();

	}

	@Override
	public void guardarPizza(Pizza pizza) {
		repository.save(pizza);
		
	}

}
