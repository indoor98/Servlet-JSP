package test.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.service.util.MvcService;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class IndexController implements Controller {

	
	
	private MvcService service;
	
	public IndexController() {
		
	}
	
	public IndexController(MvcService service) {
		this.service = service;
	}
	
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>>> IndexController execute()");
		View view = new View();
		view.setFlag(true);
		view.setResponseJsp("/main.jsp");
		
		return view;
	}
	
}











/*
@WebServlet("/index.encore")
public class IndexController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("debug >>>> IndexController doGet() ");
		RequestDispatcher view = request.getRequestDispatcher("./main.jsp");
		view.forward(request, response);
	}
		
}
*/
