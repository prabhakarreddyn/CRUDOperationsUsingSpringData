package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.crud.entities.Ticket;
import com.example.crud.service.TicketbookingService;
import com.example.crud.service.impl.TicketbookingServiceImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class CrudOperationsApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(CrudOperationsApplication.class, args);
//		TicketbookingServiceImpl ticketbookingService = applicationContext.getBean("ticketbookingServiceImpl", TicketbookingServiceImpl.class);
//		Ticket ticket = new Ticket();
//		ticket.setBookingDate("15112019");
//		ticket.setPassengerName("Prabha");
//		ticketbookingService.create(ticket);
		SpringApplication.run(CrudOperationsApplication.class, args);
	}

}
