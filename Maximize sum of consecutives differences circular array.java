class GFG
{
    long maxSum(long arr[] ,int n)
    {
     Arrays.sort(arr);
     int i=0;
     int j=n-1;
     long sum=0;
     while(i<j){
         sum=sum+Math.abs(arr[i]-arr[j]);
         sum=sum+Math.abs(arr[i+1]-arr[j]);
         i++;
         j--;
     }
     sum=sum+Math.abs(arr[0]-arr[i]);
     return sum;
        
    }
}
