package mission.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mission.mapper.BoardMapper;

public class BoardDao {
	private static BoardDao dao = new BoardDao();
	
	public static BoardDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream input = null;
		
		try {
			input = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(input);
	}
	
	public List<Board> boardList(){
		List<Board> list = null;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			list=sqlSession.getMapper(BoardMapper.class).boardList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	
	public int wInsert(Board board){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).wInsert(board);
			
			if(re>0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	public Board selectBoard(int b_id){
		Board board = new Board();
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			board = sqlSession.getMapper(BoardMapper.class).selectBoard(b_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return board;
	}
	
	public void detailBoard(int b_id){
		Board board = new Board();
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			sqlSession.getMapper(BoardMapper.class).detailBoard(b_id);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	public int wUpdate(Board board){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(BoardMapper.class).wUpdate(board);
			
			if(re>0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	public void deleteBoard(int b_id){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try{
			sqlSession.getMapper(BoardMapper.class).deleteBoard(b_id);
			sqlSession.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
}
