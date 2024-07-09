class Solution {
    public static int palindromeMaxLength(String s, int left, int right) {
        int L = left; int R = right;
        
        while( L >=0 && R < s.length() && s.charAt(L) == s.charAt(R) ) {
            L--;
            R++;
        }

        return R-L-1;
    }

    public static int solution(String s) {
        int length = s.length();
        
        int len = 1;
        for (int i = length; i >= 0; i--) {
            len = Math.max(len,palindromeMaxLength(s,i,i));
            len = Math.max(len,palindromeMaxLength(s,i,i+1));
        }

        return len;
    }
}