package com.daimler.CarApp.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.daimler.CarApp.model.Car;
import com.daimler.CarApp.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping()
	public ResponseEntity<Iterable<Car>> Get() {

	}

	@GetMapping("/{id}")
	public ResponseEntity<Car> Get(@PathVariable(value = "id") Integer vin) {

	}

	@PostMapping()
	public ResponseEntity<?> Post(@RequestBody Car car) {

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> Post(@PathVariable(value = "id"), @RequestBody Car car) {

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Integer vin) {

	}
}