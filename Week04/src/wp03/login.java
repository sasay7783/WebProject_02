package wp03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log_in")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		request.setAttribute("id", id);
		request.setAttribute("pwd", pwd);
		
		out.print("<html>");
		out.print("<head><title>로그인</title></head>");
		out.print("<body>");
		out.print("로그인되었습니다.<br>");
		out.print("ID : " + id + "<br>");
		out.print("Password : " + pwd + "<br>");
		out.print("<a href = logout>로그아웃</a>");
		out.print("</body></html>");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
//		rd.forward(request, response);
		
	}

}
