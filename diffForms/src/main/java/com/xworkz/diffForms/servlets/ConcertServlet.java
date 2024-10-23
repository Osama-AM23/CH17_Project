package com.xworkz.diffForms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xorkz.diffForms.service.ConcertForm;
import com.xorkz.diffForms.service.ConcertFormImpl;
import com.xworkz.diffForms.DTO.ConcertDTO;
@WebServlet(loadOnStartup = 1, urlPatterns = "/concert")
public class ConcertServlet extends HttpServlet {
	
	public ConcertServlet() {
		System.out.println("No-Args Concert Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String location=req.getParameter("location");
		String artist= req.getParameter("artistName");
		String ticketType= req.getParameter("ticketType");
		String noOfTickets= req.getParameter("noOfTickets");
		int convertedTickets= Integer.valueOf(noOfTickets);
		
		resp.setContentType("text/html");
		
		ConcertDTO concert= new ConcertDTO(location, artist, ticketType, convertedTickets);
		
		ConcertForm concertForm=new ConcertFormImpl();
		boolean check=concertForm.validity(concert);
		
		if(check) {
			System.out.println("Data is valid");
		}else {
			System.err.println("Data is in-valid");
		}
		System.out.println("Concert DTO: "+ concert);
		
		resp.getWriter().println(concert);
	}

}
