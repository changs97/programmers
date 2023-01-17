package day1;

public class Solution2 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] strings = str.split("");

        int size = str.length();
        int[] answer = new int[size];

        for (int i = size - 1, j = 0; i >= 0; i--) {
            answer[j++] = Integer.parseInt(strings[i]);
        }

        return answer;
    }
}
