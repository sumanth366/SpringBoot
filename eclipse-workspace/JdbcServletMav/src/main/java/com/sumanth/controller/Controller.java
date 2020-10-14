package com.sumanth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sumanth.dao.DataObjectDao;
import com.sumanth.model.DataObject;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(request.getParameter("id"));
		DataObjectDao dao = new DataObjectDao();
		DataObject d = dao.getDataObject(num);
		
		request.setAttribute("secretcode", d);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowData.jsp");
		rd.forward(request, response);
		/*
		 * HttpSession session = request.getSession();
		 * session.setAttribute("secretcode", d);
		 * response.sendRedirect("ShowData.jsp");
		 * PrintWriter out = response.getWriter();
		out.println(d);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
