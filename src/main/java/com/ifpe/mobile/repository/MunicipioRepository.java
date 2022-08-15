package com.ifpe.mobile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifpe.mobile.models.Municipio;

public interface MunicipioRepository extends MongoRepository<Municipio, Integer>{

}
