package ticTacToe;

public class Board {
	
	public String[][] field;
	
	public Board()
	{
		field=new String[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				field[i][j]="";
			}
		}
	}
	
	public void setMark(String mark,int x,int y) throws Exception
	{
		if(x<0||x>2||y<0||y>2)
		{
			throw new Exception("ungültige Koordinate");
		}
		
		if(field[x][y].equalsIgnoreCase(""))
		{
			field[x][y]=mark;
		}
		
	}
	
	public boolean hasWinner()
	{
		if(!field[0][0].equalsIgnoreCase("")&&field[0][0].equalsIgnoreCase(field[1][0])&&field[0][0].equalsIgnoreCase(field[2][0]))
		{
			return true;
		}
		else if(!field[0][0].equalsIgnoreCase("")&&field[0][0].equalsIgnoreCase(field[1][1])&&field[0][0].equalsIgnoreCase(field[2][2]))
		{
			return true;
		}
		else if(!field[0][0].equalsIgnoreCase("")&&field[0][0].equalsIgnoreCase(field[0][1])&&field[0][0].equalsIgnoreCase(field[0][2]))
		{
			return true;
		}
		else if(!field[1][0].equalsIgnoreCase("")&&field[1][0].equalsIgnoreCase(field[1][1])&&field[10][0].equalsIgnoreCase(field[1][2]))
		{
			return true;
		}
		else if(!field[2][0].equalsIgnoreCase("")&&field[2][0].equalsIgnoreCase(field[2][1])&&field[2][0].equalsIgnoreCase(field[2][2]))
		{
			return true;
		}
		else if(!field[0][1].equalsIgnoreCase("")&&field[0][1].equalsIgnoreCase(field[1][1])&&field[0][1].equalsIgnoreCase(field[2][1]))
		{
			return true;
		}
		else if(!field[0][2].equalsIgnoreCase("")&&field[0][2].equalsIgnoreCase(field[1][2])&&field[0][2].equalsIgnoreCase(field[2][2]))
		{
			return true;
		}
		else if(!field[0][2].equalsIgnoreCase("")&&field[0][2].equalsIgnoreCase(field[1][1])&&field[0][2].equalsIgnoreCase(field[2][0]))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

}
