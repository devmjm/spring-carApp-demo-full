package com.demo.CarApp.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.CarApp.model.Car;
import com.demo.CarApp.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	DataSource dataSource;

	@Autowired
	CarRepository carRepository;

	public Iterable<Car> Read() {
		return carRepository.findAll();
	}

	public Car Read(int vin) {
		return carRepository.findOne(vin);
	}

	public Car Create(Car car) {
		return carRepository.save(car);
	}

	public Car Update(Car car) {
		if (this.Exists(car.Vin)) {
			return carRepository.save(car);
		}
		return null;
	}

	public void Delete(int vin) {
		carRepository.delete(vin);
	}

	public boolean Exists(Integer vin) {
		return carRepository.exists(vin);
	}
}
