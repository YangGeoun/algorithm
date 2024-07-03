class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        Outter: for (int h = 3; h <= (brown + yellow) / 3; h++) {
            for (int w = 3; w <= (brown + yellow) / 3; w++) {
                if (w * h != brown + yellow) continue;
                if ((w * 2) + (h * 2) - 4 == brown) {
                    answer = new int[]{w, h};
                    break Outter;
                }
            }
        }
        return answer;
    }
}