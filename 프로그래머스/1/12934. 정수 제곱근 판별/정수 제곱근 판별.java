class Solution {
    public long solution(long n) {
        long answer = -1;
        // 최댓값과 최솟값 사이를 절반씩 나누면서 확인 
        long tmp1 = 0;
        long tmp2 = 7071067;
        
        while (tmp1 <= tmp2) {
            long mid = (tmp1 + tmp2) / 2;
            long midSquare = mid * mid;
            if (midSquare == n) {
                answer = (mid + 1) * (mid + 1);
                break;
            } else if (midSquare < n) {
                tmp1 = mid + 1;
            } else {
                tmp2 = mid - 1;
            }
        }
        return answer;
    }
}