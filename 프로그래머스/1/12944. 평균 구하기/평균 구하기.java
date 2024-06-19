class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        double cnt = 0;
        for (int el : arr) {
            sum += el;
            cnt += 1;
        }
        answer = sum / cnt;
        return answer;
    }
}