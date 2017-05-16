package ticTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
	
	@Test
	public void newBoard()
	{
		Board board=new Board();
		assertFalse(board.hasWinner());
	}
	
	@Test 
	public void valid_Winner() throws Exception
	{
		Board board=new Board();
		board.setMark("X", 0, 0);
		board.setMark("X", 1, 0);
		board.setMark("X", 2, 0);
		assertTrue(board.hasWinner());
	}
	
	@Test
	public void valid_noWinner()throws Exception
	{
		Board board=new Board();
		board.setMark("X", 0, 0);
		board.setMark("X", 1,0);
		board.setMark("o", 2, 0);
		assertFalse(board.hasWinner());
	}
	
	@Test (expected=Exception.class)
	public void notValid()throws Exception
	{
		Board board=new Board();
		board.setMark("X", 3, 0);
		assertFalse(board.hasWinner());
	}
}
