package com.Excrsie.JpaDataBase;

import com.Excrsie.JpaDataBase.models.Cd;
import com.Excrsie.JpaDataBase.models.Musician;
import com.Excrsie.JpaDataBase.repository.CdRepo;
import com.Excrsie.JpaDataBase.repository.MusicianRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class JpaDataBaseApplication {


    private static final Logger log = LoggerFactory.getLogger(JpaDataBaseApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(JpaDataBaseApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CdRepo cdRepo, MusicianRepo musicianRepo) {
        return (args) -> {
            Cd cd1=new Cd("DarkSide", "70's", 100F, 35F, "someGener");

            Musician musician = new Musician("sagi", "mauda", "bioSagi", new Date(), "sg", "dsfsdf");
            cd1.setMusician(musician);
            musicianRepo.save(musician);
            cdRepo.save(cd1);
          //  cdRepo.save(new Cd("Madonna", "80's", 100F, 35F, "Main"));
          //  cdRepo.save(new Cd("WillSmith", "90's", 100F, 35F, "Rap"));

          //  musicianRepo.save(new Musician("sagi", "mauda", "bioSagi", new Date(), "sg", "dsfsdf"));
          //  musicianRepo.save(new Musician("matan", "mauda", "bioMatan", new Date(), "sg", "dsfsdf"));
          //  musicianRepo.save(new Musician("nofa", "mauda", "bioNofar", new Date(), "sg", "dsfsdf"));


            for (Cd cd : cdRepo.findAll()) {

                        log.info(cd.toString());
            }
//
            Optional<Cd> cd2 = cdRepo.findById(2L);
            log.info((cd2.toString()));
//		Optional<Cd> cd2 = cdRepo.findById(2L);
//		Optional<Cd> cd3 = cdRepo.findById(2L);
//


        };

    }

}
