package mvc.model.dao;

public class OracleDao implements MvcDao {

	@Override
	public void joinRow() {
		System.out.println("debug >>>> OracleDB joinRow");
	}

	@Override
	public void loginRow() {
		System.out.println("debug >>>> OracleDB loginRow");
	}

	@Override
	public void updateRow() {
		System.out.println("debug >>>> OracleDB updateRow");
	}

	@Override
	public void deleteRow() {
		System.out.println("debug >>>> OracleDB deleteRow");
	}
	
}
