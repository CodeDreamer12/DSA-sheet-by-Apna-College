class Solution{
public:
	static bool comp(string a,string b){
         return a+b>b+a;
     }
	string printLargest(vector<string> &arr) {
	    sort(arr.begin(),arr.end(),comp);

             string ans="";

             for(auto x: arr)
                ans+=x;
         return ans;
	}
};
