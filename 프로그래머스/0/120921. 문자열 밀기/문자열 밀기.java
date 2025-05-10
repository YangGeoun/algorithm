class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        while (answer < A.length()){
            boolean flag = true;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt((i + answer) % A.length())) {
                    flag = false;
                    break;
                }
            }
            if (flag) break;
            answer++;
        }
        if (A.length() == answer) answer = -1;
        return answer;
    }
}