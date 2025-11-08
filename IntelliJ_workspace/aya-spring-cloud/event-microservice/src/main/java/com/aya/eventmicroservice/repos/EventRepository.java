package com.aya.eventmicroservice.repos;

import com.aya.eventmicroservice.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Long> {
}
