package com.project.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TripRepsitory extends JpaRepository<Trip, UUID> {
}
