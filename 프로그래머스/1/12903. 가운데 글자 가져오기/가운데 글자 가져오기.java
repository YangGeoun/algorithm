class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int num = 0;
        if (len % 2 == 0) {
            num = 1;
        }
        answer = s.substring(len / 2 - num, len / 2 + 1);
        return answer;
    }
}