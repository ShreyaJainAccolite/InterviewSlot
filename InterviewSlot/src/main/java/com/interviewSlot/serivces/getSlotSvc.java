package com.interviewSlot.serivces;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewSlot.dao.slotsRepo;
import com.interviewSlot.entities.slots;

@Service
public class getSlotSvc implements SlotServices {
	
	@Autowired
	private slotsRepo slotDao;
    
	@Override
	public List<slots> allSlots1() {
		// TODO Auto-generated method stub
		return (List<slots>) slotDao.findAll();
	}

	@Override
	public List<slots> dateWiseSlots(String date) {
		// TODO Auto-generated method stub
		//date = date.replace("-", "/");
		List<slots>slotsBydate = new ArrayList<slots>();
		List<slots>allSlot = new ArrayList<slots>();
//		allSlot=(List<slots>) slotDao.findAll();
//		for(slots slot : allSlot) {
//			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//			Date d = null;
//			try {
//				d = formatter.parse(slot.getDate());
//				System.out.println(d);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if(d == date) {
//				slotsBydate.add(slot);
//			}
//		}
		
		allSlot=(List<slots>) slotDao.findAll();
		for(slots slot : allSlot) {
			if(slot.getDate()==date) {
				slotsBydate.add(slot);
			}
		}
		
		return slotsBydate;
	}

	@Override
	public slots updateStatus(slots slot) {
		// TODO Auto-generated method stub
		List<slots>l = new ArrayList<slots>();
		l=(List<slots>) slotDao.findAll();
		for(slots s : l) {
			if(s.getemailId() == slot.getemailId()) {
				s.setStatus(slot.getStatus());
			}
		}
		
		return slot;
	}


}
