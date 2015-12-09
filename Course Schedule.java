public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0)
            return true;
            
        ArrayList[] pre = new ArrayList[numCourses];
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            pre[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            pre[prerequisites[i][0]].add(prerequisites[i][1]);
            inDegree[prerequisites[i][1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0)
                q.add(i);
        }
        int count = 0;
        while (!q.isEmpty()) {
            int t = q.poll();
            System.out.println(t);
            count++;
            for (int i = 0; i < pre[t].size(); i++) {
                inDegree[(int)pre[t].get(i)]--;
                if (inDegree[(int)pre[t].get(i)] == 0)
                    q.add((int)pre[t].get(i));
            }
        }
        
        return count == numCourses;
    }
}