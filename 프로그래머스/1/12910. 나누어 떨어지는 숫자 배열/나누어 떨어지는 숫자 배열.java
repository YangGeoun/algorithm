import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : arr) {
            if (el % divisor == 0) {
                list.add(el);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if (answer.length == 0) {
            answer =new int[]{-1};
        }
        return answer;
    }
}