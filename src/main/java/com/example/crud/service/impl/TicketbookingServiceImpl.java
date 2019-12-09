package com.example.crud.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.TicketbookingDAO;
import com.example.crud.entities.Ticket;
import com.example.crud.service.TicketbookingService;

@Service
public class TicketbookingServiceImpl implements TicketbookingService{
	
	@Autowired
	private TicketbookingDAO ticketbookingdao;
	
	public Ticket create(Ticket ticket) {
		return ticketbookingdao.save(ticket);
	}

	public Optional<Ticket> getTicketbyId(Integer ticketid) {
		return ticketbookingdao.findById(ticketid);
	}

	public Ticket fingbyPassengerName(String passengerName) {
		return ticketbookingdao.findByPassengerName(passengerName);
	}
	
	public void deleteByName(String passengerName) {
		
		ticketbookingdao.deleteByPassengerName(passengerName);
	}

	public Ticket update(Ticket ticket) {
		Optional<Ticket> ticket1 = ticketbookingdao.findById(ticket.getTicketid());
		System.out.println("ticket1::>" +ticket1);
		if(ticket.getTicketid() == 1) {
			ticket.setBookingDate(ticket.getBookingDate());
			ticket.setPassengerName(ticket.getPassengerName());
		}
		return ticketbookingdao.save(ticket);
	}	

}
