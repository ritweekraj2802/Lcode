class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = 
           new PriorityQueue<>(Collections.reverseOrder());
 
       for (Integer stone : stones) {
            pq.add(stone);
       }
 
       while (pq.size() > 1) {
          pq.add(pq.poll() - pq.poll());
       }
 
       return pq.peek();
    }
}