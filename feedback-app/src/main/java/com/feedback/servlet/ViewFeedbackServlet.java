package com.feedback.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view-feedback")
public class ViewFeedbackServlet extends HttpServlet {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/feedback_db";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String[]> feedbackList = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM feedback");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				feedbackList.add(new String[] { rs.getString("name"), rs.getString("email"), rs.getString("message") });
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("feedbackList", feedbackList);
		request.getRequestDispatcher("feedback_list.jsp").forward(request, response);
	}
}
