class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int el : numbers) {
            sum += el;
        }
        return 45 - sum;
    }
}