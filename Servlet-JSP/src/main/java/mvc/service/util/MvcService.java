package mvc.service.util;

import java.util.List;

import mvc.domain.dto.RequestUserDTO;
import mvc.domain.dto.ResponseUserDTO;

public interface MvcService {
	public void join();
	public ResponseUserDTO login(RequestUserDTO params);
	public void update();
	public void delete();
	public List<ResponseUserDTO> select();
	
}
