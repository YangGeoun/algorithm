class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum;
        if (count % 2 == 0) {
            sum = (count + 1) * (count / 2);
        } else {
            sum = (count + 1) * (count / 2) + ((count + 1) / 2);
        }
        long totalCost = price * sum;
        answer = totalCost - money;
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }
}