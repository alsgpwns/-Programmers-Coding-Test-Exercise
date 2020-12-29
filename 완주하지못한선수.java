import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};

		Solution3 sol = new Solution3();
		String answer=sol.solution(participant, completion);
		System.out.println("answer: "+answer);
	}
}

class Solution3{
	public String solution(String[] participant, String[] completion) {
		String answer="";
		int value=0;
		HashMap<String, Integer>hm = new HashMap<String, Integer>();


		for(String p:participant)
		{
			if(hm.get(p)==null)
			{
				hm.put(p, 1);
			}
			else {
				hm.put(p, hm.get(p)+1);
			}
		}
		
		for(String key : hm.keySet()){
			System.out.println(key+" ");
		}
		System.out.println("==============");
		
		for(String c:completion) {
			if(hm.get(c)>0) {
				hm.replace(c, hm.get(c)-1);
			}
			if(hm.get(c)<=0){
				hm.remove(c);
			}	
		}
		
		for(String key : hm.keySet()){
			answer=key;
		}


		return answer;
	}


}

