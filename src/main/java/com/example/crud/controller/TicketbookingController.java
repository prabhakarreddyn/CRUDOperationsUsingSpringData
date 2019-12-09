package com.example.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entities.Ticket;
import com.example.crud.service.TicketbookingService;

@RestController
@RequestMapping(value = "/api")
public class TicketbookingController {
	@Autowired
	private TicketbookingService ticketbookingService;

	@PostMapping(value = "/create")
	public ResponseEntity<Ticket> createTicket(Ticket ticket) {
		return new ResponseEntity<Ticket>(ticketbookingService.create(ticket),HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getDetailsById", produces = "application/json")
	public Optional<Ticket> TicketgetTicket(@RequestParam("ticketid") Integer ticketid) {
		return ticketbookingService.getTicketbyId(ticketid);

	}

	@GetMapping(value = "/getByname/{passengerName}")
	public Ticket findByName(@PathVariable String passengerName) {
		return ticketbookingService.fingbyPassengerName(passengerName);
	}

	@DeleteMapping(value = "/deleteBypassengername/{passengerName}")
	public void deleteUser(@PathVariable("passengerName") String passengerName) {
		ticketbookingService.deleteByName(passengerName);
	}
	@PutMapping(value="/update")
	public Ticket update(Ticket ticket) {
		return ticketbookingService.update(ticket);
		
	}

}
