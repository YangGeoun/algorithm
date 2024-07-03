class Solution {
    public int[] solution(int n, int s) {
        // 변의 길이의 합이 같을때 원이나 구가 가장 큰 넓이, 부피를 가진다.
        // 그러므로 최댓값은 각 변 사이의 차이가 가장 작은 것이 답이다.
        int[] answer = new int[n];
        int a = s / n;
        int b = s % n;
        System.out.println(a);
        for (int i = n-1; i >=0; i--) {
            if (b-- > 0) {
                answer[i] = a + 1;
            } else {
                answer[i] = a;
            }
        }
        if (s < n) {
            answer = new int[]{-1};
        }
        return answer;
    }
}