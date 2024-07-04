class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int cnt = 0;
        int apt = 1;
        float coverage = 2 * w + 1;  // 양쪽 + 현재위치
        
        // 시작 ~ 기지국, 기지국 ~ 기지국, 기지국 ~ 끝  거리를 구해서
        // 커버리지로 나누어 사이사이에 몇개의 기지국이 필요한지 계산한다.
        for (int idx = 0; idx < stations.length; idx++) {
            cnt = stations[idx] - w - apt;
            apt = stations[idx] + w + 1;
            answer += Math.ceil(cnt / coverage);  // 올림 필요
        }
        if (n > stations[stations.length-1] + w) {
            answer += Math.ceil((n - stations[stations.length-1] - w) / coverage);
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(answer);

        return answer;
    }
}