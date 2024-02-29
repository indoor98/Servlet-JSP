package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.user.ctrl.util.Controller;
import mvc.util.view.View;

public class LogoutCtrl implements Controller {

	
	/*
	 * 사용자의 명시적인 로그아웃이 요청되면
	 * 사용자 브라우저에 부여한 모든 세션을 클리어시키는 역할
	 */
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>>> LogoutCtrl execute()");
		HttpSession session = request.getSession(false); // false값을 주면 기존에 존재하는 녀석 가져온다..
		// session.removeAttribute("user"); // 특정 속성만 제거하는 함수
		session.invalidate(); // 사용자가 사용한 모든 세션을 제거하는 함수
		View view = new View();
		view.setFlag(true);
		view.setResponseJsp("main.jsp");
		return view;
	}
	
}
