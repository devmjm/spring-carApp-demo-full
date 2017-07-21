package com.daimler.CarApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.daimler.CarApp.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
