package com.aya.stagemicroservice.service;

import com.aya.stagemicroservice.dto.StageDto;
import com.aya.stagemicroservice.entities.Stage;
import com.aya.stagemicroservice.repos.StageRepository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StageServiceImpl implements StageService{

    private StageRepository stageRepository;

    @Override
    public StageDto getStageBylieuStage(String lieuStage) {
        Stage st = stageRepository.findByLieuStage(lieuStage);
        StageDto stageDto = new StageDto(
                st.getId(),
                st.getNomStage(),
                st.getNomStage()
        );
        return stageDto;
    }
}

