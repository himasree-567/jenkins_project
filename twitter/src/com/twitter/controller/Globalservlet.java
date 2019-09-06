package com.twitter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.entity.TwitterEmployee;
import com.twitter.service.Twitterservice;
import com.twitter.service.TwitterserviceInterface;

/**
 * Servlet implementation class Globalservlet
 */
public class Globalservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String option=request.getParameter("ac");
		if(option.equals("register")) {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		TwitterEmployee fe=new TwitterEmployee();
		fe.setName(name);
		fe.setPass(pass);
		fe.setEmail(email);
		fe.setAddress(address);
		TwitterserviceInterface fs=Twitterservice.createserviceobject();
		int i=fs.createprofile(fe);
		
		if(i>0) {
			out.println("profile created");
		}
		else {
			out.println("could not create profile");
		}
	}
	if(option.equals("login")) {
	}
	if(option.equals("timeline")) {
	 
		out.println("</body></html>");
	}

		
	}



	}


