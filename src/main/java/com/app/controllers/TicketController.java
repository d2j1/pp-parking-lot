package com.app.controllers;

import com.app.dtos.IssueTicketRequestDto;
import com.app.dtos.IssueTicketResponseDto;

import com.app.dtos.ResponseStatus;
import com.app.models.Ticket;
import com.app.services.TicketService;

public class TicketController {

        private final TicketService ticketService;
        public TicketController(TicketService ticketService) {
            this.ticketService = ticketService;
        }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto){

        IssueTicketResponseDto response= new IssueTicketResponseDto();

            try{

                Ticket ticket = ticketService.issueTicket(
                        requestDto.getGateId(),
                        requestDto.getVehicleNo()
                        , requestDto.getOwnerName(),
                        requestDto.getVehicleType()
                );

                response.setTicket(ticket);
                response.setResponseStatus(ResponseStatus.SUCCESS);

            }catch ( Exception e) {
                response.setTicket(null);;
                response.setResponseStatus(ResponseStatus.FAILURE);
                response.setErrorMessage(e.getMessage());
            }

        return response;
    }

}
