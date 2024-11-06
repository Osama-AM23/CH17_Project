package com.xworkz.productForm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.productForm.DTO.ProductDTO;
import com.xworkz.productForm.service.ProductService;
import com.xworkz.productForm.service.ProductServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
	
	public ProductServlet() {
		System.out.println("Execute the No-Args Constructor of ProductServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String companyName=req.getParameter("companyName");
		String productName=req.getParameter("productName");
		String productType=req.getParameter("productType");
		String productQuantity=req.getParameter("productQuantity");
		String productCost=req.getParameter("productCost");
		
		int convertedProductQuantity=Integer.valueOf(productQuantity);
		double convertedProductCost=Double.valueOf(productCost);
		
		double total=convertedProductQuantity * convertedProductCost;
		
		ProductDTO productDto= new ProductDTO(companyName, productName, productType, convertedProductQuantity, convertedProductCost);
		ProductService service= new ProductServiceImpl();
		boolean valid=service.checkAndSend(productDto);
		
		if(valid) {
			System.out.println("Product Data is Valid");
			req.setAttribute("success", "Product Data is Successfull");
			req.setAttribute("total", total);
		}else {
			System.err.println("Product Data is In-Valid");
			req.setAttribute("failed", "Product Data is Failed");
			req.setAttribute("dto", productDto );
		}
		
		RequestDispatcher reqDispatcher= req.getRequestDispatcher("/product.jsp");
		reqDispatcher.forward(req, resp);
				
				
		
	}

}
