package day1;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> name = new HashMap<>();
        for (String s : participant)
            if (name.get(s) != null) // 값이 있으면 +1
                name.put(s, name.get(s) + 1);
            else
                name.put(s, 1); // 처음이면 1
        for (String s : completion) // 완주한사람에서 1뺀다. 완주한사람은 0이됨
            name.put(s, name.get(s) - 1);
        String answer = "";
        for (Map.Entry<String, Integer> e : name.entrySet())
            if (e.getValue() > 0) {
                answer = e.getKey();
                break;
            }
        return answer;
    }
}
