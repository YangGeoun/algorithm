class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int index = 50000;
        long[] count = new long[50001];
        for (int work :works) {
            count[work] += 1;
        }
        while(n > 0 && index > 0) {
            if (count[index] == 0) {
                index--;
            } else if (count[index] <= n){ 
                n -= count[index];
                count[index - 1] += count[index];
                count[index] = 0;
                index--;
            } else {
                count[index] -= n;
                count[index - 1] += n;
                break;
            }
        }
        for (int i = 0; i <= 50000; i++) {
            answer += count[i] * (i * i);
        }
        return answer;
    }
}