import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        // 도착지점에서 반대로 계산 
        // 2로 나눌수 있으면 순간이동, 아니면 점프;   
        
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}