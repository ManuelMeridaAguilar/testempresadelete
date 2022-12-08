package com.example.test.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("incidencias")
@RestController
public class IncidenciaRestController {

	@Autowired
	IncidenciaRespository repository;
	
	@PostMapping
	public Incidencia save(@RequestBody Incidencia incidencia) {
		return  repository.save(incidencia);
	}
	
	@GetMapping
	public List<Incidencia> get(){
		return repository.findAll();
	}
}
