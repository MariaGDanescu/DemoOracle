package com.demo.microservices.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.microservices.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String>{

}
