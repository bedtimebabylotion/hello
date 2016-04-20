package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class wInsertFormAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {

		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/view/wInsertForm.jsp");
		
		return forward;
	}

}
