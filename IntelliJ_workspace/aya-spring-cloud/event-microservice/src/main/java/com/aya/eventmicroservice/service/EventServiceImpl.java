package com.aya.eventmicroservice.service;

import com.aya.eventmicroservice.dto.APIResponseDto;
import com.aya.eventmicroservice.dto.EventDto;
import com.aya.eventmicroservice.dto.StageDto;
import com.aya.eventmicroservice.entities.Event;
import com.aya.eventmicroservice.repos.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class EventServiceImpl implements EventService {
    private EventRepository eventRepository;
    //private WebClient webClient;
    private APIClient apiClient;

    @Override
    public APIResponseDto getEventById(Long id) {
        Event event = eventRepository.findById(id).get();

        StageDto stageDto = apiClient.getStageBylieuStage(event.getLieuStage());

        /*StageDto stageDto = webClient.get()
                .uri("http://localhost:8150/api/stages/" + event.getLieuStage())
                .retrieve()
                .bodyToMono(StageDto.class)
                .block();*/
        EventDto eventDto = new EventDto(
                event.getId(),
                event.getNomPres(),
                event.getNomEvent(),
                event.getLieuStage(),
                stageDto.getNomStage()
                );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEventDto(eventDto);
        apiResponseDto.setStageDto(stageDto);
        return apiResponseDto;
}}
