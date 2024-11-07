package com.xworkz.signUpForms.Servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signUpForms.DTO.SignUpDTO;
import com.xworkz.signUpForms.Service.SignUpService;
import com.xworkz.signUpForms.Service.SignUpServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/signup")
public class SignUpServlet extends HttpServlet {
	
	public SignUpServlet() {
		System.out.println("Execute No-Args constructor of SignUpServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String userId=req.getParameter("userId");
		 String email= req.getParameter("email");
		 String password=req.getParameter("password");
		 String confirmPasword=req.getParameter("confirmPassword");
		 int convertedUserId=Integer.valueOf(userId);
		 
		 SignUpDTO signup= new SignUpDTO(convertedUserId, email, password, confirmPasword);		 
		 SignUpService service= new SignUpServiceImpl();
		 boolean check=service.checkAndSave(signup);
		 
		 if(check) {
			 System.out.println("Data is valid");
			 req.setAttribute("success", "Sign Up succesfully");
		 }else {
			 System.err.println("Data is In-Valid");
			 req.setAttribute("failed", "SignUp Failed");
			 req.setAttribute("dto",signup );
		 }
		 
		 RequestDispatcher request=req.getRequestDispatcher("/SignUp.jsp");
		 request.forward(req, resp);

		
		
	}
	
}
