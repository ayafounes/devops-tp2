package com.aya.stagemicroservice.repos;


import com.aya.stagemicroservice.entities.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Stage,Long> {
    Stage findByLieuStage(String lieuStage);
}