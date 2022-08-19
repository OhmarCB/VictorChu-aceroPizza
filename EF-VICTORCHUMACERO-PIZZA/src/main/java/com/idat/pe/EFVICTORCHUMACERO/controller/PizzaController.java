package com.idat.pe.EFVICTORCHUMACERO.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.entity.Pizza;
import com.idat.pe.EFEFVICTORCHUMACEROPIZZA.service.PizzaService;

@RestController
@RequestMapping("/exa/pizza")
public class PizzaController {

	@Autowired
	private PizzaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizza(){
		return service.listarPizza();
	}
}
