class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y)pq.offer(x-y);
        }
        return pq.isEmpty()? 0:pq.poll();
        
    }
}