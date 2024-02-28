package mvc.util.view;


//View.java의 역할
// FrontController인 DistpatcherController가 화면의 방식과 응답 페이지 정보를 반환받을 수 있도록 한다.


public class View {
	
	private String responseJsp; // 응답페이지 정보
	private boolean isFlag; // true -> forward, false -> redirect
	
	public View() {
		
	}
	
	public View(String responseJsp, boolean isFlag) {
		super();
		this.responseJsp = responseJsp;
		this.isFlag = isFlag;
	}

	public String getResponseJsp() {
		return responseJsp;
	}
	
	public void setResponseJsp(String responseJsp) {
		this.responseJsp = responseJsp;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	
	
}
