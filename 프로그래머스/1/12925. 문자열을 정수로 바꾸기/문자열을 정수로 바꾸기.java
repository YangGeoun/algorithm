class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] c = s.toCharArray(); 
        if (c[0] == '+') {
            answer = Integer.parseInt(s.substring(1,s.length()));
        } else if (c[0] == '-') {
            answer = Integer.parseInt(s.substring(1,s.length())) * -1;
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}