package com.feedback.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/feedback_db";
	private static final String DB_USER = "root"; // your MySQL username
	private static final String DB_PASS = "root"; // your MySQL password

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		try {
			// Load MySQL driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to database
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

			String sql = "INSERT INTO feedback (name, email, message) VALUES (?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, message);

			stmt.executeUpdate();
			conn.close();

			// After saving, redirect to Thank You page
			response.sendRedirect("thank_you.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().println("Error: " + e.getMessage());
		}
	}
}
