class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);
        long num2;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            num2 = Long.parseLong(t.substring(i, p.length() + i));
            if (num2 <= num) {
                answer += 1;
            }
        }
        return answer;
    }
}