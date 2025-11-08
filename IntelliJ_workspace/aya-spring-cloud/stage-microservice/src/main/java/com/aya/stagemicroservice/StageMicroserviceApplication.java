package com.aya.stagemicroservice;

import com.aya.stagemicroservice.entities.Stage;
import com.aya.stagemicroservice.repos.StageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StageMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StageMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StageRepository stageRepository) {
        return args -> {
            stageRepository.save(Stage.builder()
                    .nomStage("Carthage")
                    .lieuStage("Tunis")
                    .build());
            stageRepository.save(Stage.builder()
                    .nomStage("JCI")
                    .lieuStage("Tunisie")
                    .build());
        };
    }
}
