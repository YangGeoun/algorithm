import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        boolean flag = false;
        char[] cArr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        
        for (char c : cArr) {
            if (c == '(') {
                stack.add(1);
            }
            else if (c == ')') {
                if (stack.empty()) {
                    flag = true;
                    break;
                }
                stack.pop();
            }
        }
        answer = stack.empty();
        if (flag) answer = false;
        return answer;
    }
}