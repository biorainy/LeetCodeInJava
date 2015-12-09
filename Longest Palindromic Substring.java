public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] isPalindrome = new boolean[len][len];
        int longest = 0;
        int start = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || isPalindrome[i+1][j-1])) {
                    isPalindrome[i][j] = true;
                    if (j - i + 1 > longest) {
                        longest = j - i + 1;
                        start = i;
                    }
                }
            }
        }
        
        return s.substring(start, start + longest);
    }
}