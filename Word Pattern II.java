public class Solution {
    public boolean wordPatternMatch(String pattern, String str) {
        if (pattern.length() == 0 && str.length() == 0)
            return true;
        else if (pattern.length() == 0)
            return false;
        else if (str.length() == 0)
            return false;
         return wordPatternMatch(pattern, 0, str, 0, new HashMap<Character, String>());
    }
    
    public boolean wordPatternMatch(String pattern, int m, String str, int n, HashMap<Character, String> hm) {
        if (m == pattern.length() && n == str.length())
            return true;
        else if ( n == str.length())
            return false;
        else if (m == pattern.length())
            return false;
        
        if (!hm.containsKey(pattern.charAt(m))) {
            for (int i = n; i < str.length(); i++) {
                if (!hm.values().contains(str.substring(n, i+1))) {
                    hm.put(pattern.charAt(m), str.substring(n, i+1));
                   // System.out.print("put key: " + pattern.charAt(m) + " and value: " + str.substring(n, i+1) + " into hashmap.");
                    if (wordPatternMatch(pattern, m + 1, str, i + 1, hm))
                        return true;
                    hm.remove(pattern.charAt(m));
                }
            }
        } else {
            String t = hm.get(pattern.charAt(m));
            if (n + t.length() <= str.length() && str.substring(n, n + t.length()).equals(t) && wordPatternMatch(pattern, m + 1, str, n + t.length(), hm))
                return true;
            else
                return false;
        }
        
        return false;
    }
}