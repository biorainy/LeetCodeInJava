public class Solution {
    List<String> resList = new ArrayList<>();
    boolean[] canPartition;
    public List<String> wordBreak(String s, Set<String> wordDict) {
        boolean[][] dp = findWordBreak(s, wordDict);
        wordBreak(s, dp, 0, "");
        return resList;
    }
    
    public void wordBreak(String s, boolean[][] dp, int p, String res) {
        if (p == s.length())
            resList.add(res);
        String k = "";
        for (int i = p; i < s.length(); i++) {
            if (dp[p][i] && (i + 1 == s.length() || canPartition[i + 1])) {
                //System.out.println("dp[p][i] is p = " + p +" and i = " + i);
                if (res.equals(""))
                    k = s.substring(p, i + 1);
                else
                    k = res + " " + s.substring(p, i + 1);
                wordBreak(s, dp, i + 1, k);
            }
        }    
    }
    
    public boolean[][] findWordBreak(String s, Set<String> wordDict) {
        
        int len = s.length();
        boolean[][] dp= new boolean[len][len];
        canPartition = new boolean[len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (wordDict.contains(s.substring(i, j + 1))) {
                    dp[i][j] = true;
                    if (j + 1 == len)
                        canPartition[i]  = true;
                    //System.out.println("dp[i][j] is i = " + i +" and j = " + j);
                    if (j+1 < len && canPartition[j+1]) {
                        canPartition[i] = true;
                        //System.out.println("canPartition[i] is true, i = " + i);
                    }
                }
            }
        }
        
        return dp;
    }
}