class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> dayQue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
        	int temp = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);

            if (!dayQue.isEmpty() && dayQue.peek() < temp) {
                answerList.add(dayQue.size());
                dayQue.clear();
            }
            dayQue.offer(temp);
        }

        answerList.add(dayQue.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
