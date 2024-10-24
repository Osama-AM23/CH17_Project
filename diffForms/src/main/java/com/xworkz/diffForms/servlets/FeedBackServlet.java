package com.xworkz.diffForms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xorkz.diffForms.service.FeedBackForm;
import com.xorkz.diffForms.service.FeedBackFormImpl;
import com.xworkz.diffForms.DTO.FeedBackDTO;
@WebServlet(loadOnStartup = 1, urlPatterns = "/feedback")
public class FeedBackServlet extends HttpServlet {
	
	
	public FeedBackServlet() {
		System.out.println("No-Args FeedBack Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String comment=req.getParameter("comments");
		
		resp.setContentType("text/html");
		
		FeedBackDTO feedback= new FeedBackDTO(name, email, comment);
		
		FeedBackForm feedBackForm= new FeedBackFormImpl();
		boolean isVerify=feedBackForm.validateAndSumbit(feedback);
		
		if(isVerify) {
			System.out.println("Data is valid");
		}else {
			System.err.println("Data is in-valid");
		}
		
		req.setAttribute("name", name);
		req.getRequestDispatcher("/FeedBack.jsp").forward(req, resp);

		System.out.println("FeedBack :"+feedback);
		resp.getWriter().println(feedback);
	}

}
