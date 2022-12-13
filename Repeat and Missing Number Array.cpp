vector<int> Solution::repeatedNumber(const vector<int> &A) {
    long long int n=A.size();
     long long int sum=n*(n+1)/2;
       long long int sqSum=n*(n+1)*(2*n+1)/6;
       long long int aSum=0;
       long long int aSqSum=0;
       for(int i=0; i<n; i++){
           aSum+=(long long int)A[i];
           aSqSum+=(long long int)A[i]*(long long int)A[i];
       }
       long long int val1=(sum-aSum);
       long long int val2=(sqSum-aSqSum)/val1;
       vector<int> ans;
       ans.push_back((val2-val1)/2);
       ans.push_back((val2+val1)/2);
       return ans;
}
