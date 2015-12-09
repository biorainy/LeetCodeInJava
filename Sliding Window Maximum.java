public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[0];
        Queue<Integer> q = new PriorityQueue<>(new MyComparator());
        int[] res = new int[nums.length - k + 1];
        
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if (i >= k - 1) {
                res[i - k + 1] = q.peek();
                q.remove(nums[i-k+1]);
            }
        }
        return res;
    }

}

class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}