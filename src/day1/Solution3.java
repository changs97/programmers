package day1;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> name = new HashMap<>();

        for(String s : participant)
            name.put(s, name.getOrDefault(s, 0)+1); // boxing
        for(String s : completion) // 완주한사람에서 1뺀다. 완주한사람은 0이됨
            name.put(s, name.get(s)-1);
        String answer ="";
        for(Map.Entry<String, Integer> e : name.entrySet())
            if(e.getValue() > 0) {
                answer = e.getKey();
                break;
            }
        return answer;
    }
}
