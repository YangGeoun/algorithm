import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        // bfs 활용하여 거리를 잰다.
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[n + 1];
        visited[0] = 1;
        visited[1] = 1;
        int start;
        int max = 0;
        q.add(1);
        
        while(!q.isEmpty()){
            start = q.poll();
            for (int i = 0; i < edge.length; i++) {
                if (edge[i][0] == start && visited[edge[i][1]] == 0) {
                    visited[edge[i][1]] = visited[start] + 1;
                    q.add(edge[i][1]);
                }
                if (edge[i][1] == start && visited[edge[i][0]] == 0) {
                    visited[edge[i][0]] = visited[start] + 1;
                    q.add(edge[i][0]);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (max < visited[i]) {
                answer = 1;
                max = visited[i];
            } else if (max == visited[i]) {
                answer++;
            }
        }
        return answer;
    }
}