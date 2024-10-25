package com.xworkz.oct24Web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.oct24Web.DTO.RegisterDTO;
import com.xworkz.oct24Web.service.RegisterService;
import com.xworkz.oct24Web.service.RegisterServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/apply")
public class RegisterServlet  extends HttpServlet{
	
	public RegisterServlet() {
		System.out.println("RegisterServlet No-Args Const");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		String name=arg0.getParameter("name");
		String email= arg0.getParameter("email");
		String age= arg0.getParameter("age");
		String city=arg0.getParameter("city");
		String state=arg0.getParameter("state");
		String country=arg0.getParameter("country");
		
		
		RegisterDTO register= new RegisterDTO(name, email, age, city, state, country);
		System.out.println("Register :"+register);
		
		RegisterService regSer= new RegisterServiceImpl();
		boolean ref=regSer.checkAndSend(register);
		
		if(ref) {
			System.out.println("Given Data is Valid");
			arg0.setAttribute("success", "Successfully Register");
		}else {
			System.err.println("Given Data is in-Valid");
			 arg0.setAttribute("failed", "Register Failed");
			 arg0.setAttribute("dto", new RegisterDTO(name, email, age, city, state, country));
		}
		
		
		RequestDispatcher requestDispatcher=arg0.getRequestDispatcher("/Register.jsp");
		requestDispatcher.forward(arg0, arg1);
	}
	
	

}
