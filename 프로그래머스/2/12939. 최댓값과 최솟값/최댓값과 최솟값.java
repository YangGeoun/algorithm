class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);
        for (String str : sArr) {
            int num = Integer.parseInt(str);
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        answer = "" + min + " " + max;
        return answer;
    }
}