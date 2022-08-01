package com.ifpe.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifpe.mobile.models.Ocorrencia;

public interface OcorrenciaRepository extends MongoRepository<Ocorrencia, Integer>{

}
