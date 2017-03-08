package servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");
System.out.println("fsef");
		if (Validate.checkUser(name, password)) {
			out.print("Hello World! ");
		} else {
			out.println("Username or Password incorrect");
			RequestDispatcher rs = request.getRequestDispatcher("NewFile.jsp");
			rs.include(request, response);
		}
	}
}
