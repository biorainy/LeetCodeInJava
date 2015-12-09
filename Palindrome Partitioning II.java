public class Solution {
    public int minCut(String s) {
        int len = s.length();
        boolean[][] isPal = new boolean[len][len];
        int minCut[] = new int[len];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            minCut[i] = len - i - 1;
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || isPal[i+1][j-1])) {
                    isPal[i][j] = true;
                    if (j == len - 1)
                        minCut[i] = 0;
                    else if (minCut[j+1] + 1 < minCut[i]) {
                        minCut[i] = minCut[j+1] + 1;
                    }
                }
            }
        }
        
        return minCut[0];
    }
    
}