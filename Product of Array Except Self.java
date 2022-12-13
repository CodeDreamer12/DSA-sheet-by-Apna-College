class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int ans=1;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                count++;
            }
            else{
             ans=ans*nums[i];
            }
            
        }
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                if(count>1){
                arr[i]=0;
                }
                else{
                    arr[i]=ans;
                }
            }
            else{
                if(count>0){
                    arr[i]=0;
                }
                else{
                    arr[i]=ans/nums[i];
                }
            }

        }
        return arr;
        
    }
}
