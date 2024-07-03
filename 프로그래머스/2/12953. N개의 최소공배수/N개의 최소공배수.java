class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int tmp1, tmp2;
        for (int i = 1; i < arr.length; i++) {
            tmp1 = answer;
            tmp2 = arr[i];
            while (tmp1 != tmp2) {
                if (tmp1 < tmp2) {
                    tmp1 += answer;
                } else {
                    tmp2 += arr[i];
                }
            }
            answer = tmp1;
        }
        return answer;
    }
}