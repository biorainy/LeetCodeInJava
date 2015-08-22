public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        
        if (n == 0) {
            res.add(0);
            return res;
        }
        
        List<Integer> pool = new ArrayList<>();    
        for (int i = 1; i < Math.pow(2, n); i++) {
            pool.add(i);
        }
        int last = 0; 
        res.add(last);
        int current = pool.get(0);
        int i = 0;
        while(pool.size() != 0) {
            current = pool.get(i);
            if (((last ^ current) & ((last ^ current) - 1)) == 0 )  {
                last = current;
                res.add(current);
                pool.remove(new Integer(current));
                i = 0;
            } else
                i++;
                if (i >= pool.size())
                    return res;
        }
        
        return res;
    }
}