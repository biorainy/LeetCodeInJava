public class ValidWordAbbr {
    List<String> uniqueAbbrev;
    List<String> dict;
    public ValidWordAbbr(String[] dictionary) {
        uniqueAbbrev = new ArrayList<>();
        dict = new ArrayList<>(); 
        for (String s : dictionary) {
            dict.add(s);
            String abbrev = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
            uniqueAbbrev.add(abbrev);
        }
    }

    public boolean isUnique(String word) {
        String t = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
        if (!dict.contains(word))
            return !uniqueAbbrev.contains(t);
        else {
            int count = 0;
            for (String s : dict) {
                if (s.equals(word))
                    count++;
            }
            int count2 = 0;
            for (String ss : uniqueAbbrev) {
                if (ss.equals(t))
                    count2++;
            }
            return count2 <= count;
        }
            
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");