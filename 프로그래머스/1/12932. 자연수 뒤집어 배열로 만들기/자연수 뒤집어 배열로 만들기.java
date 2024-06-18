import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        // 편하게 추가, 삭제하기 위해 List 사용
        List<Integer> ans = new ArrayList<>();
        while (n >= 10) {
            ans.add((int) (n % 10));
            n = n / 10;
        }
        ans.add((int) n);
        // 출력 형태 맞춰주기 위한 코드
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}