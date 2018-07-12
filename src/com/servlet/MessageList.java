package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.po.Message;
import com.service.ListService;

public class MessageList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置编码
		request.setCharacterEncoding("UTF-8");
		// 接受页面的值
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		ListService listService = new ListService();
		// 查询消息列表并传给页面
		request.setAttribute("messageList", listService.queryMessageList(command, description));
		// 向页面传值
		request.setAttribute("command", command);
		request.setAttribute("description", description);
		// 向页面跳转
		request.getRequestDispatcher("WEB-INF/jsp/list.jsp").forward(request, response);
		
		
//		//设置编码
//		request.setCharacterEncoding("UTF-8");
//		//接收页面的值
//		String command=request.getParameter("command");
//		String description=request.getParameter("description");
//		//向页面传值
//		request.setAttribute("command", command);
//		request.setAttribute("description", description);
//		//实例化Service
//		ListService listService=new ListService();
//		//显示查询结果
//		request.setAttribute("messagesList", listService.queryMessageList(command, description));
//		//跳转
//		request.getRequestDispatcher("WEB-INF/jsp/list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
