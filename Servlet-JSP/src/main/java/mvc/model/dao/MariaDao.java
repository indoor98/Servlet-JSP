package mvc.model.dao;

public class MariaDao implements MvcDao {

	@Override
	public void joinRow() {
		System.out.println("debug >>>> MariaDB joinRow");
	}

	@Override
	public void loginRow() {
		System.out.println("debug >>>> MariaDB loginRow");
	}

	@Override
	public void updateRow() {
		System.out.println("debug >>>> MariaDB updateRow");
	}

	@Override
	public void deleteRow() {
		System.out.println("debug >>>> MariaDB deleteRow");
	}
	
	

}
