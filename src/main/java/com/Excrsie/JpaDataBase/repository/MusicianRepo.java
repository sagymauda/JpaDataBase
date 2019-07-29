package com.Excrsie.JpaDataBase.repository;

import com.Excrsie.JpaDataBase.models.Musician;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface MusicianRepo extends CrudRepository<Musician, Long> {


}
