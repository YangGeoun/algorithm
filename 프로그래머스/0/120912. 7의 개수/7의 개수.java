class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int el : array){
            int start = 10000;
            while (start > 0) {
                if (el / start == 7) answer++;
                el = el % start;
                start /= 10; 
            }
        }
        return answer;
    }
}