package com.Excrsie.JpaDataBase.repository;

import com.Excrsie.JpaDataBase.models.Cd;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CdRepo extends CrudRepository<Cd, Long> {
    void delete(Cd cd1);
}
