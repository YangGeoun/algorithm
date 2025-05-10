class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int minus = 0;
        int n = 1;
        while (n < num) {
            minus += n++;
        }
        int start = (total - minus) / num;
        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }
        return answer;
    }
}