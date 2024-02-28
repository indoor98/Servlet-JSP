package mvc.bean.factory;

import java.util.HashMap;
import java.util.Map;

import mvc.model.dao.MariaDao;
import mvc.model.dao.MvcDao;
import mvc.service.util.MvcService;
import mvc.service.util.MvcServiceImpl;
import mvc.user.ctrl.DeleteCtrl;
import mvc.user.ctrl.JoinCtrl;
import mvc.user.ctrl.LoginCtrl;
import mvc.user.ctrl.SelectCtrl;
import mvc.user.ctrl.UpdateCtrl;
import mvc.user.ctrl.util.Controller;
import test.ctrl.IndexController;

/*
 * MVC Pattern에서 FrontController와 실제 Controller 사이에서 동작한다.
 */
public class BeanFactory {
	private Map<String, Controller> map;
	private static BeanFactory instance;
	private static MvcService service;
	private static MvcDao dao;
	
	// join.hanwha, login.hanwha, update.hanwha, delete.hanwha
	public BeanFactory() {
		
		map = new HashMap<String, Controller>();
		dao = new MariaDao();
		service = new MvcServiceImpl(dao);
		
		map.put("/join.hanwha", new JoinCtrl(service));
		map.put("/login.hanwha", new LoginCtrl(service));
		map.put("/update.hanwha", new UpdateCtrl(service));
		map.put("/delete.hanwha", new DeleteCtrl(service));
		map.put("/select.hanwha", new SelectCtrl(service));
		map.put("/index.hanwha", new IndexController(service));
	}
	
	public static BeanFactory getInstance() { 
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	// interface를 반환한다!!
	public Controller getCtrl(String clientPath) {
		 return map.get(clientPath);
	}
}
