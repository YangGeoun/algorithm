class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int horizontal = M - 1;
        int vertical = N - 1;
        answer = horizontal + (horizontal + 1) * vertical;
        return answer;
    }
}