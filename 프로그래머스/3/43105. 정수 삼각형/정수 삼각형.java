class Solution {
    public int solution(int[][] triangle) {
        // 아래부터 합의 최댓값을 찾아 올라가는 방법으로 풀이
        int[][] sumArr = new int[triangle.length][triangle.length];
        // 맨 아랫줄부터 2개씩 비교해서 위로 더해가며 올라가서 최종적으로 최댓값이 [0][0] 인덱스까지 올라간다.
        for (int i = triangle.length-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i + 1][j] > triangle[i + 1][j + 1]) {
                    triangle[i][j] = triangle[i + 1][j] + triangle[i][j];
                } else triangle[i][j] = triangle[i + 1][j + 1] + triangle[i][j];
            }
        }
        int answer = triangle[0][0];
        return answer;
    }
}