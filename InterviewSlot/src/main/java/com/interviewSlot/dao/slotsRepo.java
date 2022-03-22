package com.interviewSlot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewSlot.entities.Slot;

public interface slotsRepo extends JpaRepository<Slot, Integer> {

}
