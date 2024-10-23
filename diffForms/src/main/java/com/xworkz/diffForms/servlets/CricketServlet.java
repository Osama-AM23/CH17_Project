package com.xworkz.diffForms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xorkz.diffForms.service.CricketForm;
import com.xorkz.diffForms.service.CricketFormImpl;
import com.xworkz.diffForms.DTO.CricketDTO;
@WebServlet(loadOnStartup = 1, urlPatterns = "/cricket")
public class CricketServlet extends HttpServlet {
	
	public CricketServlet() {
		System.out.println("No-Args Cricket servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String groundName= req.getParameter("groundName");
		String customerName=req.getParameter("customerName");
		String email=req.getParameter("customerEmail");
		String seatType=req.getParameter("seatType");
		String noOfTickets= req.getParameter("noOfTickets");
		int convertedTickets= Integer.valueOf(noOfTickets);
		
		resp.setContentType("text/html");
		
		CricketDTO cricket = new CricketDTO(groundName, customerName, email, seatType, convertedTickets);		
		CricketForm cricketForm= new CricketFormImpl();
		boolean check=cricketForm.isApply(cricket);
		
		if(check) {
			System.out.println("Data is valid");
		}else {
			System.err.println("Data is in-valid");
		}
		
		System.out.println("Cricket Dto :"+cricket);
		
		resp.getWriter().println(cricket);
		
		
	}

}
