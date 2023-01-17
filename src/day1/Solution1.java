package day1;

public class Solution1 {
    public int[] solution(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int count = 0;

        for (int i : arr) {
            if (max == i) {
                count++;
            }
        }

        int[] answer = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                answer[j++] = i;
            }
        }
        return answer;
    }
}
