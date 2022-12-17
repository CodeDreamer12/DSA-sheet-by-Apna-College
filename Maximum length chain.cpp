bool comparator(struct val a, struct val b){
    return a.second<b.second;
}
class Solution{
public:
    /*You are required to complete this method*/
    int maxChainLen(struct val p[],int n){
        sort(p,p+n,comparator);
        int ans=1;
        int prev=p[0].second;
        for(int i=1; i<n; i++){
            if(prev<p[i].first){
                prev=p[i].second;
                ans++;
            }
        }
        return ans;
    }
};
