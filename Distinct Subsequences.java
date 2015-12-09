public class Solution {
    public int numDistinct(String s, String t) {
       
            
        int[][] memo = new int[t.length()+1][s.length()+1];
        
        for (int j = 0; j < memo[0].length; j++)
            memo[0][j] = 1;
        
        for(int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == t.charAt(i)) {
                    memo[i+1][j+1] = memo[i+1][j] + memo[i][j];
                } else {
                    memo[i+1][j+1] = memo[i+1][j];
                }
            }
        }
        
        return memo[t.length()][s.length()];
    }
}