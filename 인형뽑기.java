import java.util.Arrays;

public class ÀÎÇü»Ì±â {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves= {1,5,3,5,1,2,1,4};
		int result= sol.solution(board,moves);
		System.out.println("result: "+result);
	}
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int i=0;
        int j=0;
        int [] temp_arr=new int[moves.length];
        
        System.out.println("temp_arr: "+temp_arr.length);
        
        while(j<temp_arr.length-1)
        {
        	
        	System.out.println("moves[j]: "+moves[j]);
        	switch(moves[j])
        	{
	        	case 1:
	        		while(board[i][0]==0)
	        		{
	        			i++;
	        			System.out.println("dd: "+board[i][0]);
	        		}
	        		
	        		if(i>=board.length)
	        		{
	        			System.out.println("if");
	        			break;
	        		}
	        		else {
	        			System.out.println("else");
		        		temp_arr[j]=board[i][0];
		        		break;
	        		}
	        		
	        	case 5:
	        		if(i>=board.length)
	        		{
	        			
	        		}
	        		else if(board[i][4]==0)
	        		{
	        			i++;
	        			break;
	        		}
	        		else {
		        		temp_arr[i]=board[i][4];
		        		break;
	        		}
	        		break;
        	}
        	j++;
//        	System.out.println("board["+i+"][0]: "+board[i][0]);
        }
        
        ////////////////
        System.out.println(Arrays.toString(temp_arr));
        System.out.println(Arrays.toString(moves));
        return answer;
    }
}
