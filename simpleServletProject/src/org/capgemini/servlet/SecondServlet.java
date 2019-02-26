package org.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "in second servlet", urlPatterns = { "/SecondServletPath" })
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	HttpSession session=request.getSession();
		
//		Cookie cookies[]=request.getCookies();
//		String str=null;
//		
//		for(Cookie c:cookies) {
//			if(c.getName().equals("t1")) {
//				str=c.getValue();
//			}
//				
//		}
	String str=request.getParameter("t1");
//		System.out.println(str);
		
		PrintWriter out= response.getWriter();
		out.print("welcome  "+str);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}