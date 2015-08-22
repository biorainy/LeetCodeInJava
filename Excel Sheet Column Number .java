public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        int multiplier = 0;
        for (int i = s.length() - 1; i>=0; i--) {
            
            int temp = s.charAt(i) - 'A' + 1;
            
            num += temp * Math.pow(26, multiplier);
            
            multiplier++;
        }
        
        return num;
    }
}