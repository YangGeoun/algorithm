class Solution {
    public int[] solution(int[] numbers) {
        int[] cntArr = new int[201];
        int cnt = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if (cntArr[numbers[i] + numbers[j]] == 0) {
                    cntArr[numbers[i] + numbers[j]] = 1;
                    cnt++;
                }
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for (int i = 0; i < 201; i++) {
            if (cntArr[i] == 1) {
                answer[cnt++] = i;
            }
        }
        return answer;
    }
}