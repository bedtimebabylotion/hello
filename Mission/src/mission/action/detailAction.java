package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.model.Board;
import mission.model.BoardService;

public class detailAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("b_id");
		int b_id = Integer.parseInt(id);
		
		BoardService service = new BoardService();
		Board board = service.selectBoardService(b_id);
		service.detailBoardService(b_id);
		
		request.setAttribute("board", board);
		
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/view/detail.jsp");

		return forward;
	}

}
