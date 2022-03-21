package com.interviewSlot.serivces;

import java.util.Date;
import java.util.List;

import com.interviewSlot.entities.slots;

public interface SlotServices {
	// return all slots
	public List<slots> allSlots1();
	//return slots according to date
	public List<slots> dateWiseSlots(String date);
    //Updates status of slot
	public slots updateStatus(slots slot);
}
