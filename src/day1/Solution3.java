package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, ArrayList<Boolean>> hashMap = new HashMap<>();

        for (String p : participant) {
            if (hashMap.getOrDefault(p, null) == null) {
                ArrayList<Boolean> arrayList = new ArrayList<>();
                arrayList.add(false);
                hashMap.put(p, arrayList);
            } else {
                hashMap.get(p).add(false);
            }
        }

        for (String c : completion) {
            if (hashMap.get(c).size() > 1) {
                hashMap.get(c).add(true);
            } else {
                hashMap.get(c).set(0, true);
            }
        }

        String answer = "";

        for (String p : participant) {
            if (hashMap.get(p).size() > 1) {
                int trueCount = 0;
                int falseCount = 0;

                for (boolean b : hashMap.get(p)) {
                    if (b) {
                        trueCount++;
                    } else {
                        falseCount++;
                    }
                }
                if (trueCount != falseCount) {
                    answer = p;
                    break;
                }
            } else {
                if (!hashMap.get(p).get(0)) {
                    answer = p;
                    break;
                }
            }
        }

        return answer;
    }
}
