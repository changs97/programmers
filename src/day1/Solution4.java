package day1;


import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    public boolean solution(int[] lotto) {
        Set<Integer> set = new HashSet<>();
        for (int i : lotto)
            set.add(i);

        return set.size() == 6;
    }
}
