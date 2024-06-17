class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        for (char c : s.toCharArray()) {
            if (c=='P' || c=='p') {
                pNum++;
            } else if (c=='Y' || c=='y') {
                yNum++;
            }
        }
        answer = (pNum == yNum);
        return answer;
    }
}