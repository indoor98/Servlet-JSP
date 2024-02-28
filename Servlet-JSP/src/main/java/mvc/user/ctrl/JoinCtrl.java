package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.service.util.MvcService;
import mvc.service.util.MvcServiceImpl;
import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class JoinCtrl implements Controller {
	
	private MvcService service;
	
	public JoinCtrl() {
		
	}
	
	public JoinCtrl(MvcService service) {
		this.service = service;
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>>> JoinCtrl");
		service.join();
		View view = new View();
		view.setFlag(true);
		view.setResponseJsp("./join/join.jsp");
		return view;
		
		
	}
}
