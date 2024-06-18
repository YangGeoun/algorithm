class Solution {
    public long solution(long n) {
        long answer = 0;
        int[] mask = new int[10];
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            mask[c - '0'] += 1;
        }
        for (int i = 9; i >= 0; i--) {
            while (mask[i] > 0) {
                answer = answer * 10 + i;
                mask[i] -= 1;
            }
        }
        return answer;
    }
}