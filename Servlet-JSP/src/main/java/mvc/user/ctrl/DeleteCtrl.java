package mvc.user.ctrl;

import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;
import mvc.service.util.MvcService;
import mvc.service.util.MvcServiceImpl;

public class DeleteCtrl implements Controller {

	private MvcService service;
	
	public DeleteCtrl() {
		
	}
	
	public DeleteCtrl(MvcService service) {
		this.service = service;
	}
	
	@Override
	public View execute() {
		System.out.println("debug >>>> DeleteCtrl");
		View view = new View();
		service.delete();
		
		view.setFlag(true);
		view.setResponseJsp("./delete/delete.jsp");
		return view;
	}
}
