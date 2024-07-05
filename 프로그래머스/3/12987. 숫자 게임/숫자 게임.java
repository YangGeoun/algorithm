import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int indexA = 0;
        int indexB = 0;
        while (indexA < A.length && indexB < B.length) {
            if (A[indexA] < B[indexB]) {
                indexA++;
                answer++;
            }
            indexB++;
        }
        return answer;
    }
}