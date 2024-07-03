import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int cnt = 0;
        int[] visited = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        
        while (cnt < n) {
            int start = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    start = i;
                    visited[i] = 1;
                    answer++;
                    cnt++;
                    break;
                }
            }
            queue.add(start);
            while(!queue.isEmpty()) {
                start = queue.poll();
                for (int i = 0; i < n; i++) {
                    if (computers[start][i] == 1 && visited[i] == 0) {
                        queue.add(i);
                        visited[i] = 1;
                        cnt++;
                    }
                }
            }
        }
        return answer;
    }
}