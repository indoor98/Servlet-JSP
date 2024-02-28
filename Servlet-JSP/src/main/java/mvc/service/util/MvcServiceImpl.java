package mvc.service.util;

import mvc.model.dao.MvcDao;

public class MvcServiceImpl implements MvcService {

	private static MvcDao mvcDao;
	
	public MvcServiceImpl(MvcDao Dao) {
		mvcDao = Dao;
	}
	
	@Override
	public void join() {
		System.out.println("debug >>>> service join()");
		mvcDao.joinRow();
	}

	@Override
	public void login() {
		System.out.println("debug >>>> service login()");
		mvcDao.loginRow();
	}
 
	@Override
	public void update() {
		System.out.println("debuf >>>> service update()");
		mvcDao.updateRow();
	}

	@Override
	public void delete() {
		System.out.println("debug >>>> service delete()");
		mvcDao.deleteRow();
	}

}
