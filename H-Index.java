public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int h = n; h > 0; h--) {
            if (citations[n - h] >= h)
                return h;
        }
        return 0;
    }
}

public class Solution {
    public int hIndex(int[] citations) {
      int len = citations.length;
      int[] arr = new int[len + 1];
      for (int i = 0; i < citations.length; i++) {
          if (citations[i] > len)
            arr[len]++;
          else
            arr[citations[i]]++;
      }
      int total = 0;
      for (int i = len; i >=0; i--) {
          total += arr[i];
          if (total >= i)
            return i;
      }
      
      return 0;
      
      /*  Arrays.sort(citations);
        int n = citations.length;
        for (int h = n; h > 0; h--) {
            if (citations[n - h] >= h)
                return h;
        }
        return 0;*/
    }
}