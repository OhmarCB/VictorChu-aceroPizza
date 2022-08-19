package com.idat.pe.EFEFVICTORCHUMACEROPIZZA.service;

import java.util.List;

import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.entity.Pizza;


public interface PizzaService {
	public List<Pizza> listarPizza();
	public void guardarPizza(Pizza pizza);
}
