package mission.mapper;

import java.util.List;

import mission.model.Board;

public interface BoardMapper {
	public List<Board> boardList();
	public int wInsert(Board board);
	public int wUpdate(Board board);
	public Board selectBoard(int b_id);
	public void detailBoard(int b_id);
	public void deleteBoard(int b_id);
	
}
