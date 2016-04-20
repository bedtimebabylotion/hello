package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.model.Board;
import mission.model.BoardService;

public class deleteBoardAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("b_id"); //id를 가져온다.
		int b_id = Integer.parseInt(id);
		
		BoardService service = new BoardService();
		Board board = service.selectBoardService(b_id); // 가져온 id의 board객체를 가져온다.
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(true);
		
		if(board.getB_pwd().equals(request.getParameter("b_pwd"))){
			service.deleteBoardService(b_id); // 이 id의 board객체를 삭제한다.
			forward.setPath("listAction.do");
		}else{
			forward.setPath("/view/pwdCheck.jsp");
		}
		
		return forward;
	}

}
