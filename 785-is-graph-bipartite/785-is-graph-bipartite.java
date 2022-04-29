class Solution {
    public boolean isBipartite(int[][] graph) {
        //BFS
        // 0(not meet), 1(black), 2(white)
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].length != 0 && colors[i] == 0) {
                colors[i] = 1;
                // BFS
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                while(! q.isEmpty()) {
                    int cur = q.poll();
                    for (int v: graph[cur]) { // expand its neighbor
                        if (colors[v] == 0) {
                            colors[v] = (colors[cur] == 1) ? 2 : 1;
                            q.offer(v);
                        } else {
                            if (colors[v] == colors[cur]) return false;
                        }
                    }
                }                        
            }
        }
        return true;
    }
}