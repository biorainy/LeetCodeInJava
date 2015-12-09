public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if (beginWord == null || endWord == null || beginWord.length() == 0 || endWord.length() == 0|| beginWord.length() != endWord.length())
        return 0;
        
        LinkedList<String> queue = new LinkedList<>();
        queue.add(beginWord);
        queue.add(null);
        int level = 1;
        
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if (s == null) {
                if(queue.isEmpty())
                    return 0;
                else {
                    queue.add(null);
                    level++;
                    continue;
                }
            }
                
            for (int i = 0; i < s.length(); i++) {
                char[] charArr = s.toCharArray();
                for (int j = 'a'; j <= 'z'; j++) {
                    charArr[i] = (char)j;
                    String newS = new String(charArr);
                    if (newS.equals(endWord))
                        return level + 1;
                    else if (wordDict.contains(newS)) {
                        queue.add(newS);
                        wordDict.remove(newS);
                    } else
                        continue;
                }
            }
        }
        return 0;
    }
}