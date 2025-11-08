package com.aya.stagemicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class StageDto {
        private Long id;
        private String nomStage;
        private String lieuStage;
    }

