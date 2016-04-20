package mission.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.model.Board;
import mission.model.BoardService;

public class wUpdateAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("b_id");
		int b_id = Integer.parseInt(id);
		
		BoardService service = new BoardService();
		Board board = service.selectBoardService(b_id);
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		
		if(board.getB_pwd().equals(request.getParameter("b_pwd"))){
			board.setB_content(request.getParameter("b_content"));
			board.setB_title(request.getParameter("b_title"));
			
			int re = service.wUpdateService(board);
			
			if(re>0){
				forward.setPath("listAction.do");
			}else{
				forward.setPath("/view/fail.jsp");
			}
		}else{
			forward.setPath("/view/pwdCheck.jsp");
		}
		return forward;
	}

}
