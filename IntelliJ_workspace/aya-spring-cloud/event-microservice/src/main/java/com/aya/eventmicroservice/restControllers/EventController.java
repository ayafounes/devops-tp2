package com.aya.eventmicroservice.restControllers;

import com.aya.eventmicroservice.dto.APIResponseDto;
import com.aya.eventmicroservice.dto.EventDto;
import com.aya.eventmicroservice.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {
    private EventService eventService;
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEventById(@PathVariable("id")
                                                     Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                eventService.getEventById(id), HttpStatus.OK);
    }

}
