import java.lang.Math;

class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n; 
        if (my_str.length() % n != 0) length++;
        String[] answer = new String[length];
        int index = 0;
        int i = 0;
        while (index < my_str.length()) {
            String tmp = my_str.substring(index, Math.min(index + n, my_str.length()));
            answer[i++] = tmp;
            index = index + n;
        }
        return answer;
    }
}