 package org.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "simple description of servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
public int i;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet
	(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//System.out.println("do get method responded");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	PrintWriter writer =response.getWriter();
	writer.println(i);
	i++;
//		String username=request.getParameter("userName");
//		writer.println("user input"+username);
//	
	      writer.println("<h2>this response fron doget method</h2><h3>welocome dear  in html </h3>");
	}

}
