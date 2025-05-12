// n * m 모든 지점에서 bfs 진행 
// 몇개가 연결되었는지와 어떤 n 인덱스에 포함되는지 기록
// 기록된 n 인덱스마다 연결된 갯수만큼 더해준다.
// 마지막에 가장 큰 값 return

import java.lang.Math;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    
    static int n, m;
    static int[] lineSum;
    static int[] dr = new int[]{-1, 1, 0, 0};
    static int[] dc = new int[]{0, 0, -1, 1};
    static int[][] map;
    static boolean[][] isVisited;
    
    public int solution(int[][] land) {
        int answer = 0;
        map = land;
        n = land.length;
        m = land[0].length;
        lineSum = new int[m];
        isVisited = new boolean[n][m];
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1 && !isVisited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            answer = Math.max(answer, lineSum[i]);
        }
        return answer;
    }
    
    private void bfs(int startR, int startC){
        Queue<int[]> q = new LinkedList<>();
        int[] now = new int[]{startR, startC};
        isVisited[startR][startC] = true;
        int count = 1;
        boolean[] lineVisited = new boolean[m];
        lineVisited[startC] = true;
        q.add(now);
        while(!q.isEmpty()){
            now = q.poll();
            for (int d = 0; d < 4; d++) {
                int newR = now[0] + dr[d];
                int newC = now[1] + dc[d];
                if (0 <= newR && newR < n && 0 <= newC && newC < m){
                    if (!isVisited[newR][newC] && map[newR][newC] == 1) {
                        q.add(new int[]{newR, newC});
                        isVisited[newR][newC] = true;
                        lineVisited[newC] = true;
                        count++;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++) {
            if (lineVisited[i]) lineSum[i] += count;
        }
        return;
    }
}