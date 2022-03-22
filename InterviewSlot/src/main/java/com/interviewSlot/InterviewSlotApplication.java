package com.interviewSlot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.interviewSlot.dao.slotsRepo;
import com.interviewSlot.entities.Slot;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@SpringBootApplication
public class InterviewSlotApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(InterviewSlotApplication.class, args);
//	    slotsRepo slotRepo = context.getBean(slotsRepo.class);
		
		SpringApplication.run(InterviewSlotApplication.class, args);
	    
	    //slots slot1 = new slots(101, "Spring Boot");
	    //slots newSlot = slotRepo.save(slot1);
	    //System.out.println(newSlot);
	    
	    //Create and Save
//	    slots slot = new slots(); 
//	    slot.setSlotId(2);
//	    slot.setemailId("nishant@xyz.com");
//	    slot.setDate("2022-03-22");
//	    slot.setStartTime("11:00 am");
//	    slot.setEndTime("12:00 am");
//	    slot.setStatus("conducted");
//	    slotRepo.save(slot);
//	    
//	    slots slot1 = new slots(); 
//	    slot1.setSlotId(2);
//	    slot1.setemailId("nishant@xyz.com");
//	    slot1.setDate("2022-10-22");
//	    slot1.setStartTime("11:00 am");
//	    slot1.setEndTime("12:00 am");
//	    slot1.setStatus("conducted");
//	    slotRepo.save(slot1);
	    
//	    slots slot2 = new slots();
//	    slot2.setSlotId(3);
//	    slot2.setemailId("shreya@xyz.com");
//	    slot2.setDate("2/11/22");
//	    slot2.setStartTime("12:00 am");
//	    slot2.setEndTime("1:00 am");
//	    slot2.setStatus("conducted");
//	    slotRepo.save(slot2);
//	    
//	    slots slot4 = new slots();
//	    slot4.setSlotId(4);
//	    slot4.setemailId("pqr@xyz.com");
//	    slot4.setDate("25/03/22");
//	    slot4.setStartTime("10:00 am");
//	    slot4.setEndTime("12:00 am");
//	    slot4.setStatus("not-conducted");
//	    slotRepo.save(slot4);
//	    
//	    slots slot5 = new slots();
//	    slot5.setSlotId(5);
//	    slot5.setemailId("mno@xyz.com");
//	    slot5.setDate("24/03/22");
//	    slot5.setStartTime("11:00 am");
//	    slot5.setEndTime("1:00 pm");
//	    slot5.setStatus("conducted");
//	    slotRepo.save(slot5);
//	    
	    //slots slot2 = new slots();
	    //slot2.setId(102);
	    //slot2.setCourse("Basics of CRUD");
	    
	    //List<slots> allNewSlots = List.of(slot1,slot2);
	    //Iterable<slots> createdSlots = slotRepo.saveAll(allNewSlots);
	    
	    //createdSlots.forEach(slot->{
	    //	System.out.println(slot);
	    //});
	    //System.out.println("DONE!!");
	    
	    //Update and Save
	    //java.util.Optional<slots> optional = slotRepo.findById(3);
	    //slots updateSlot = ((java.util.Optional<slots>) optional).get();
	    //updateSlot.setCourse("JAVA Backend");
	    
	    //slots finalUpdatedSlot = slotRepo.save(updateSlot);
	    //System.out.println(finalUpdatedSlot);
	    
	    //Iterable<slots> itr = slotRepo.findAll();
	    //itr.forEach(slot->System.out.println(slot));
	    
	    //Deleting the Slot
	    //slotRepo.deleteById(4);
	    //System.out.println("Deleted!!");
	    
	    
	}

}