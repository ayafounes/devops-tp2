package com.aya.eventmicroservice;


import com.aya.eventmicroservice.entities.Event;
import com.aya.eventmicroservice.repos.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class EventMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(EventRepository eventRepository) {
        return args -> {
            eventRepository.save(Event.builder()
                    .nomEvent("Festival de musique")
                    .nomPres("Lana Del Rey")
                    .lieuStage("USA")
                    .build());

        };
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
