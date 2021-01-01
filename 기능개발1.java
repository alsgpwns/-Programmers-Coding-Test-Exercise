import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
         int num=0, top_num=0;
        Queue<Integer> dayQue = new LinkedList<>();
        ArrayList<Integer> answerArray = new ArrayList<>();
        

        //날짜 입력
        for(int i=0; i<progresses.length; i++) {
        	int temp = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);
        	dayQue.add(temp);
        }
        
        //날짜 비교
        while(!dayQue.isEmpty()) {
        	int count=1;
        	top_num = dayQue.poll();
        	if(!dayQue.isEmpty()) num = dayQue.peek();
        	
        	while(top_num>=num && !dayQue.isEmpty()) {
        		dayQue.remove();
        		if(!dayQue.isEmpty()) num = dayQue.peek();
        		count++;
        	}
        	answerArray.add(count);
        }
        return answerArray;
    }
}
