package mission.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mission.action.Action;
import mission.action.ActionForward;
import mission.action.deleteBoardAction;
import mission.action.deleteBoardFormAction;
import mission.action.detailAction;
import mission.action.listAction;
import mission.action.wInsertAction;
import mission.action.wInsertFormAction;
import mission.action.wUpdateAction;
import mission.action.wUpdateFormAction;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length()+1);
		
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("listAction.do")){
			action = new listAction();
			forward = action.excute(request, response);
		}else if(command.equals("wInsertForm.do")){
			action = new wInsertFormAction();
			forward = action.excute(request, response);
		}else if(command.equals("wInsertAction.do")){
			action = new wInsertAction();
			forward = action.excute(request, response);
		}else if(command.equals("detailAction.do")){
			action = new detailAction();
			forward = action.excute(request, response);
		}else if(command.equals("wUpdateFormAction.do")){
			action = new wUpdateFormAction();
			forward = action.excute(request, response);
		}else if(command.equals("wUpdateAction.do")){
			action = new wUpdateAction();
			forward = action.excute(request, response);
		}else if(command.equals("deleteBoardFormAction.do")){
			action = new deleteBoardFormAction();
			forward = action.excute(request, response);
		}else if(command.equals("deleteBoardAction.do")){
			action = new deleteBoardAction();
			forward = action.excute(request, response);
		}
		
		if(forward != null){
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

}
