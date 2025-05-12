class Solution {
    public int solution(int n) {
        int answer = 2;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            long square = (long) mid * mid; 
            if (square == n) {
                answer = 1;
                break;
            } else if (square > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}