package com.aya.eventmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;
    private String nomEvent;
    private String nomPres;
    private String lieuStage;
    private String nomStage;
}
