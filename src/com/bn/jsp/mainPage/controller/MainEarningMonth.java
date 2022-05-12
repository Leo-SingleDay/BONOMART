package com.bn.jsp.mainPage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bn.jsp.mainPage.model.service.MainService;
import com.bn.jsp.mainPage.model.vo.MainPageInfo;
import com.google.gson.Gson;

/**
 * Servlet implementation class MainEarningMonth
 */
@WebServlet("/earnMonth.mp")
public class MainEarningMonth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainEarningMonth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MainService service = new MainService();
		
		MainPageInfo mp = service.selectEarningMonth();
		
		response.setContentType("application/json; charset=UTF-8");
		
		new Gson().toJson(mp, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
