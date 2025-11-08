package com.aya.eventmicroservice.service;

import com.aya.eventmicroservice.dto.APIResponseDto;
import com.aya.eventmicroservice.dto.EventDto;

public interface EventService {
    APIResponseDto getEventById(Long id);
}
