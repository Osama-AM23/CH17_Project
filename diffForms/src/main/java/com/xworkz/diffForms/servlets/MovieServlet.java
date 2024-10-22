package com.xworkz.diffForms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.diffForms.DTO.MovieDTO;
@WebServlet(loadOnStartup = 1, urlPatterns = "/movie")
public class MovieServlet extends HttpServlet{
	
	public MovieServlet() {
		System.out.println("No-Args Movie Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String ticket=req.getParameter("totalTickets");
	String theaterName=req.getParameter("theaterName");
	String seatType=req.getParameter("seatType");
	String donation=req.getParameter("donation");
	String date=req.getParameter("date");
	String time=req.getParameter("time");
	int convertedTicket=Integer.valueOf(ticket);
	
	resp.setContentType("text/html");
	
	MovieDTO movie= new MovieDTO(name, convertedTicket, theaterName, seatType, donation, date, time);
	System.out.println("Movie DTO :"+ movie);
	
	resp.getWriter().println(movie);
	
	
	}

}
