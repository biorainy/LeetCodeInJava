public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = say(s);
        }
        
        return s;
    }
    
    public String say(String s) {
        if (s.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        char cur = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                sb.append(Integer.toString(count) + cur);
                count = 1;
                cur = s.charAt(i);
            } else
                count++;
        }
        
        sb.append(Integer.toString(count) + cur);
        
        return sb.toString();
    }
}