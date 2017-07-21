package com.demo.CarApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.CarApp.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
