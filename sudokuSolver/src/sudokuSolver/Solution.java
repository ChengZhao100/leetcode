package sudokuSolver;

public class Solution{
	public void solveSudoku(char[][] board){
		if(board==null || board.length==0)
			return;
		solve(board);
	}
	
	public boolean solve(char[][] board){
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(board[i][j]=='.'){
					for(char c='1'; c<='9'; c++){
						if(isValid(board,i,j,c)){
							board[i][j]=c;
							if(solve(board))
								return true;
							else
								board[i][j]='.';
//							这个地方想想一般情形，若下次循环不能实现，这次的数据肯定要清空的，以便于进行c++的尝试
						}
					}
					return false;
				}
			}
		}
		return true;//这个地方是考虑最后一个元素完成后
	}
	
	public boolean isValid(char[][] board, int i, int j, char c){
		for(int row=0;row<9;row++){
			if(c==board[row][j])
				return false;
		}
		for(int col=0;col<9;col++){
			if(c==board[i][col])
				return false;
		}
		for(int row=(i/3)*3; row<(i/3)*3+3; row++){
			for(int col=(j/3)*3; col<(j/3)*3+3; col++){
				if(c==board[row][col])
					return false;
			}
		}
		return true;
	}
}