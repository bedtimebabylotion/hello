package mission.model;

import java.io.IOException;
import java.util.List;


public class BoardService {
	public static BoardDao dao;
	public static BoardService service = new BoardService();
	
	public static BoardService getInstance(){
		dao = dao.getInstance();
		return service;
	}
	
	public List<Board> boardListService(){
		List<Board> list = dao.boardList();
		return list;
	}
	
	public int wInsertService(Board board){
		int re=dao.wInsert(board);
		return re;
	}
	
	public int wUpdateService(Board board){
		int re = dao.wUpdate(board);
		return re;
	}
	
	public Board selectBoardService(int b_id){
		Board board = dao.selectBoard(b_id);
		return board;
	}

	public void detailBoardService(int b_id){
		dao.detailBoard(b_id);
	}
	
	public void deleteBoardService(int b_id){
		dao.deleteBoard(b_id);
	}
	
}
