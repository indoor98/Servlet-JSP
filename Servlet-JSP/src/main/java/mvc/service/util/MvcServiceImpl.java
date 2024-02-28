package mvc.service.util;

import java.util.List;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;
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
	public ResponseUserDTO login(RequestUserDTO dto) {
		System.out.println("debug >>>> service login()");
		return mvcDao.loginRow(dto);
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

	@Override
	public List<ResponseUserDTO> select() {
		System.out.println("debug >>>> service select()");
		return mvcDao.selectRow();
	}
	
	

}
