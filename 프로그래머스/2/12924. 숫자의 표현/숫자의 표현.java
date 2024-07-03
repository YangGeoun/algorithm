class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= n / 2; i++) {
            sum = 0;
            j = 0;
            while(sum < n) {
                sum += i + j++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }
}