package test.ctrl;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.domain.dto.TestDTO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login.encore")
public class LoginController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("debug >>>> Client uri : " + request.getRequestURL() );
		System.out.println("debug >>>> Client QueryString : " + request.getQueryString());
		System.out.println("debug >>>> request method : " + request.getMethod() );
		
		String id = null;
		String pwd = null;
		
		
		if( request.getMethod().equals("GET")) {
			id = request.getParameter("id");
			pwd = request.getParameter("pwd");
			System.out.println( "debug >>>> params : " + id );		
			System.out.println( "debug >>>> params : " + pwd );
		}
		
		if( id.equals("encore") && pwd.equals("encore")) {
			// 백엔드로부터 전달받은 데이터(가정)
			TestDTO params = new TestDTO();
			params.setId("encore"); params.setPwd("encore"); params.setName("엔코아");

			// scope는 Forward되어지는 페이지까지만 데이터를 유지할 수 있다.
			request.setAttribute("user", params); // Request Scope
			
			// 세션에 데이터를 심는다면?
			HttpSession session = request.getSession();
			session.setAttribute("user", params);
		    
			
			RequestDispatcher view = request.getRequestDispatcher("./ok.jsp");
			view.forward(request, response);
			
			// response.sendRedirect("./ok.jsp");
			
		} else {
			
			RequestDispatcher view = request.getRequestDispatcher("./error.jsp");
			view.forward(request, response);
			
		}
	}
}
