class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        for(int x:nums){
            heap.add(x);
            if(heap.size()>k){
                heap.poll();
            }
            
        }
        return heap.peek();
        
    }
}