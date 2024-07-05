import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // 정렬 후에 처음부터(작은것부터) 비교하며 B가 크면 answer++ 하고 다음 인덱스 비교
        // A가 크면 indexA는 두고 indexB만 ++; (지금 B로는 무엇도 이길 수 없어서)
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