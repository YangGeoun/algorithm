import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
		int ans = 1;
        Arrays.sort(routes, (o1, o2)->{
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});
		int end = routes[0][1];
		for(int i = 1; i < routes.length; i++) {
			if(routes[i][0]>end) {
				ans += 1;
				end = routes[i][1];
			}
		}
        return ans;
    }
}