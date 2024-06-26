class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] cArr = s.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') {
                continue;
            }
            if (cArr[i] >= 'a' && cArr[i] <= 'z') {
                cArr[i] += n;
                if (cArr[i] > 'z') cArr[i] -= 26;
            }
            if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
                cArr[i] += n;
                if (cArr[i] > 'Z') cArr[i] -= 26;
            }
        }
        answer = String.valueOf(cArr);
        return answer;
    }
}