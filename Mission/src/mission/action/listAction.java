package mission.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.model.Board;
import mission.model.BoardService;

public class listAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		BoardService service = BoardService.getInstance();
		List<Board> list = service.boardListService();
		
		request.setAttribute("list", list);
		
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/view/list.jsp");
		
		return forward;
	}

}
