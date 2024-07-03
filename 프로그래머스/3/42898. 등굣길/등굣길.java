class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] map = new int[n + 1][m + 1]; // n은 세로 길이, m은 가로 길이
        map[1][1] = 1;
        
        // 물웅덩이 위치 설정
        for (int[] el : puddles) {
            map[el[1]][el[0]] = -1;
        }
        
        // 첫 번째 행 초기화
        for (int i = 2; i <= m; i++) {
            if (map[1][i] == -1) {
                map[1][i] = 0;
            } else {
                map[1][i] = map[1][i-1];
            }
        }
        
        // 첫 번째 열 초기화
        for (int i = 2; i <= n; i++) {
            if (map[i][1] == -1){
                map[i][1] = 0;
            } else {
                map[i][1] = map[i-1][1];
            }
        }
        
        // 나머지 지도 값 채우기
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                if (map[i][j] == -1) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = (map[i - 1][j] + map[i][j - 1]) % 1000000007;
                }
            }
        }
        
        answer = map[n][m];
        return answer;
    }
}
