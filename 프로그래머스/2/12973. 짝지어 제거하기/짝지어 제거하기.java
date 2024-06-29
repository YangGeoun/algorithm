import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
        }
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}