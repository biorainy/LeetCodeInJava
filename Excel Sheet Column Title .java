public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int m = (n-1) % 26;
            char c =(char)('A' + m);
            sb.insert(0, c);
            n = (n - 1) / 26;
        }
        
        return sb.toString();
    }
}