package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteBoardFormAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("b_id");
		int b_id = Integer.parseInt(id);
		
		request.setAttribute("b_id", b_id);
		
		ActionForward forward = new ActionForward();

		forward.setRedirect(false);
		forward.setPath("/view/deleteForm.jsp");

		return forward;
	}

}
