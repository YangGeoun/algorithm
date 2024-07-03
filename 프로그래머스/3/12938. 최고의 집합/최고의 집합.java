class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int a = s / n;
        int b = s % n;
        System.out.println(a);
        for (int i = n-1; i >=0; i--) {
            if (b-- > 0) {
                answer[i] = a + 1;
            } else {
                answer[i] = a;
            }
        }
        if (s < n) {
            answer = new int[]{-1};
        }
        return answer;
    }
}