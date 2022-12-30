class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
       int sum = 0, i = N - 1, mi = 0;
        Arrays.sort(arr);
        while(i >= 1) {
            mi = arr[i] - arr[i - 1];
            if(mi < K) {
                sum += arr[i] + arr[i - 1];
                i -= 2;
            } 
            else {
                i--;
            } 
        }
        return sum;
    }
    
}
