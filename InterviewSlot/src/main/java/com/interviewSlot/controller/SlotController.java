package com.interviewSlot.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotat1ion.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.interviewSlot.entities.slots;
import com.interviewSlot.serivces.SlotServices;

@RestController
public class SlotController {
	//@RequestMapping(value="/" , method = RequestMethod.GET)
	@Autowired
	private SlotServices slotService;

	@GetMapping("/")
	public List<slots> allSlots1(){
		return this.slotService.allSlots1();
	}
	
//	@GetMapping("/date/{date}")
//	public List<slots> dateWiseSlots(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
//		//System.out.println(date);
//		//System.out.println(date.getDate());
//		return this.slotService.dateWiseSlots(date);
//	}
	
	@GetMapping("/date/{date}")
	public List<slots> dateWiseSlots (@PathVariable("date") String date){
		return this.slotService.dateWiseSlots(date);
		
	}
	
	@PutMapping("/satus")
	public slots updateStatus (@RequestBody slots slot) {
		return this.slotService.updateStatus(slot);
	}
}
