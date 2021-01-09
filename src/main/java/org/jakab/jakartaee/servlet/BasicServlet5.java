package org.jakab.jakartaee.servlet;

import java.io.IOException;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicServlet5
 */
@WebServlet(urlPatterns = "/BasicServlet5",name = "BasicServlet5")
public class BasicServlet5 extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2839742702046285303L;

	/**
     * Default constructor. 
     */
    public BasicServlet5() {
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		//create JSON from an object using jakarta ee JSONB
		
		JsonObject jsonObject = Json.createObjectBuilder()
										.add("userName", "myUserName")
										.add("email", "myEmailAddress@myDomain.com")
										.build();

		java.util.List<JsonObject> list = new java.util.ArrayList<JsonObject>();
		list.add(jsonObject);
		java.util.List<Object> listofList = new java.util.ArrayList<Object>();
		listofList.add(list);
		JsonArray ja = Json.createArrayBuilder(listofList).build();
		
//		JsonArray ja = Json.createArrayBuilder().add(
//							Json.createArrayBuilder().add(jsonObject).build()).build();
		
		response.getWriter().append(ja.toString());
//		writer.append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
