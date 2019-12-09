package com.example.crud.service;

import java.util.Optional;

import com.example.crud.entities.Ticket;

public interface TicketbookingService {	
	Ticket create(Ticket ticket);
	Optional<Ticket> getTicketbyId(Integer ticketid);
	Ticket fingbyPassengerName(String passengerName);
	void deleteByName(String passengerName);
	Ticket update(Ticket ticket);

}
