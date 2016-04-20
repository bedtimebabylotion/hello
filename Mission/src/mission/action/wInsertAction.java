package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.model.Board;
import mission.model.BoardService;

public class wInsertAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		Board board = new Board();
		
		board.setB_name(request.getParameter("b_name"));
		board.setB_content(request.getParameter("b_content"));
		board.setB_title(request.getParameter("b_title"));
		board.setB_pwd(request.getParameter("b_pwd"));
		
		BoardService service = new BoardService();
		int re = service.wInsertService(board);
		
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(true);
		
		if(re>0){
			forward.setPath("listAction.do");
		}else{
			forward.setPath("/view/fail.jsp");
		}
		
		return forward;
	}

}
