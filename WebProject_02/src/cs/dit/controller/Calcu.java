package cs.dit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calcu")
public class Calcu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Calcu() {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int num1, num2;
		int result;
		String cal;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		cal = request.getParameter("calc");
		
		result = calc(num1, num2, cal);
		
		out.println("<html>");
		out.println("<head><title>계산기</title></head>");
		out.println("<body><center>");
		out.println("<h2>계산결과</h2>");
		out.println("<hr>");
		out.println(num1 + " " + cal + " " + num2 + " = " + result);
		out.println("<input type=\"button\" value=\"되돌아가기\" onclick=\"history.back();\">");
		out.println("</body></html>");
	}
	
	public int calc(int num1, int num2, String cal) {
		int result = 0;
		switch (cal) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num2 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		return result;
	}

}
