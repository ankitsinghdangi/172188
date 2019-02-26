package org.capgemini.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "this is about first servlet", urlPatterns = { "/FirstServletPath" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("t1");
//		Cookie cookie=new Cookie("t1", str);
//	
//		HttpSession session=request.getSession();
//	String st=	(String) session.getAttribute(str);
//		session.setAttribute("t1",str);
//		response.addCookie(cookie);
		
		response.sendRedirect("SecondServletPath?t1="+str);
//		
//	RequestDispatcher rd=request.getRequestDispatcher("SecondServletPath");
//		rd.forward(request, response);
//		//System.out.println("in first servlet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
