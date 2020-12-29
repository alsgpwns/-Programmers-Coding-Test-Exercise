import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		int i=0, j=0, k=0;
        
        for(int c=0; c<=commands.length-1; c++)
		{
			i=commands[c][0]-1;
			j=commands[c][1]-1;
			k=commands[c][2]-1;
			int[] temp= new int[j-i+1];
			int count=0;
            for(int a=i; a<=j; a++) 
			{
				temp[count++]=array[a];
			}
            Arrays.sort(temp);
			answer[c]=temp[k];
        }
        return answer;
    }
}
