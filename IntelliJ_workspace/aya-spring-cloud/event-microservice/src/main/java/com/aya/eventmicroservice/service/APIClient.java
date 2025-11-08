package com.aya.eventmicroservice.service;

import com.aya.eventmicroservice.dto.StageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "stage-microservice")
//@FeignClient(url = "http://localhost:8150", value = "Stage")
public interface APIClient {
    @GetMapping("api/stages/{stage-lieuStage}")
    StageDto getStageBylieuStage(@PathVariable("stage-lieuStage")
                               String lieuStage );
}
