package com.example.crud.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entities.Ticket;

@Repository
@Transactional
public interface TicketbookingDAO extends CrudRepository<Ticket, Integer> {
	
	public Ticket findByPassengerName(String passengerName);
	public void deleteByPassengerName(String passengerName);
	
	
}
