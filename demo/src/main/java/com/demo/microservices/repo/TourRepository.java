package com.demo.microservices.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.microservices.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {

}
