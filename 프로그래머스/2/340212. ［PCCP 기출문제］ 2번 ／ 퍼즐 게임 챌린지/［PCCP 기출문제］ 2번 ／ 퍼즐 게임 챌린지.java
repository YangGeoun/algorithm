class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int numOfpuzzle = diffs.length;
        int min = 1;
        int max = 0;
        int answre = 0;

        // max값 초기화 (diffs 배열 중 최대값으로 설정)
        for (int el : diffs) {
            max = Math.max(max, el);
        }

        // 이진탐색 시작
        while (min < max) {
            int mid = min + (max - min) / 2;
            long sum = 0;

            for (int index = 0; index < numOfpuzzle; index++) {
                long levelDiff = diffs[index] - mid;
                if (levelDiff <= 0) {
                    sum += times[index];
                } else {
                    if (index == 0) {
                        sum += times[index] * (levelDiff + 1);
                    } else {
                        sum += (times[index] + times[index - 1]) * levelDiff + times[index];
                    }
                }
                if (sum > limit) break; // 조기 종료
            }

            if (sum <= limit) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return max;
    }
}
