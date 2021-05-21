

/**
 * 
 * @author 
 *
 */

public class TicTacToe {
	
	    private String[][] board;
	    private int turn;
	    
	    /**
	     * Creates a new Tic Tac Toe board.  Instantiates the 3x3 board
	     * with all dashes or other place holders.
	     * 
	     * initializes number of turns taken to equal 0
	     */
	    
	    public TicTacToe() 
	    {
	    	
	    	this.board = new String[3][3];
	    	
	    	for(int r = 0; r < board.length;r++)
	    	{
	    		for(int c = 0; c < board[0].length;c++)
	    		{
	    			board[r][c] = "  - ";
	    		}
	    	}
	    	
	    	this.turn = 0;
	    }
	    
	    
	   
	    /**
	     * Getter method for current turn number
	     * @return number of turns taken
	     */
	    
	    public int getTurn() 
	    {
	    	return this.turn;
	    }
	    
	    
	    
	   
	   /**
	    * This method prints out the board array on to the console
	    */
	    
	   public void printBoard()
	   {
		   for(String[] r : board)
		   {
			   for(String c : r)
			   {
				   System.out.print(c + " ");
			   }
			   System.out.println();
		   }
	       
	   }
	   
	   /**
	    * 
	    * This method determines if space row, col is an available space to choose
	    * @return: true if the board[row][col] is available, false otherwise
	    * 
	    */
	   
	   public boolean pickLocation(int row, int col)
	   {
		   if(board[row][col] == "  - ")
		   {
			   return true;
		   }
		   
		   return false;
	   }
	   
	   /**
	    * 
	    * This method places an X or O at board[row][col] based on the int turn
	    */
	   
	   public void takeTurn(int row, int col)
	   {
		   if(pickLocation(row, col))
		   {
			   
		      if(this.turn % 2 == 0)
		      {
		    	  this.board[row][col] = "  X ";
		      }
		      
		      else
		      {
		    	  this.board[row][col] = "  O ";
		      }
		      
		      turn++;
		   }
	   }
	   
	   /**
	    * 
	    * This method checks if any row has all X's or all Os
	    * @return: true if there is a row with all the same value, false otherwise. 
	    */
	   
	   
	   public boolean checkRow()
	   {
		   
		   for(int r = 0; r < board.length;r++)
	    	{
	    		for(int c = 0; c < board[0].length;c++)
	    		{
	    			if(c == c+1 && c == c+2)
	    			{
	    				return true;
	    			}
	    		}
	    	}
		   
		   return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if any col has all X's or all Os
	    * @return: true if there is a col with all the same value, false otherwise. 
	    */
	   
	   public boolean checkCol()
	   {
		   for(int c = 0; c < board[0].length; c++)
	    	{
	    		for(int r = 0; r < board.length; r++)
	    		{
	    			if(r == r+1 && r == r+2)
	    			{
	    				return true;
	    			}
	    		}
	    	}
		   
		   return false;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if either diagonal has all X's or all Os
	    * @return: true if either diagonal with all the same value, false otherwise. 
	    */
	   
	   public boolean checkDiag()
	   {
		   for(int r = 0; r < board.length; r++)
	    	{
	    		for(int c = 0; c < board[0].length; c++)
	    		{
	    			if(this.board[r][c] == this.board[r+1][c+1])
	    			{
	    				return true;
	    			}
	    		}
	    		
	    	}
		   return false;
	   }
	   
	   /**
	    * 
	    * This method checks if a player has won the game via a row, col, or diagonal
	    * @return: true if the game is won, false otherwise
	    */
	   public boolean checkWin()
	   {
	       if(checkRow() || checkCol())
	       {
	    	   return true;
	       }
	       
	       return false;
	   }

}
