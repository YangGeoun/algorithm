class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[]{n, m};
        int tmp1 = n;
        int tmp2 = m;
        while (tmp1 != tmp2) {
            if (tmp1 < tmp2) {
                tmp1 += n;
            } else if (tmp1 > tmp2) {
                tmp2 += m;
            }
        }
        answer[1] = tmp1;
        tmp1 = n;
        tmp2 = m;
        while (tmp1 != tmp2) {
            if (tmp1 < tmp2) {
                tmp2 -= tmp1;
            } else if (tmp1 > tmp2) {
                tmp1 -= tmp2;
            }
        }
        answer[0] = tmp1;
        
        return answer;
    }
}