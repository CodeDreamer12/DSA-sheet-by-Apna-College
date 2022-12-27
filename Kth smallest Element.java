class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<=r; i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    } 
}
