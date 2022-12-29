class Solution {
    int maxSubstring(String S) {
        int max_until=0;
        int ma=Integer.MIN_VALUE;
        for(int i=0; i<S.length(); i++){
            int x=(S.charAt(i)=='0')?1:-1;
            max_until+=x;
            if(max_until>ma){
                ma=max_until;
            }
            if(max_until<0){
                max_until=0;
            }
        }
        return ma;
    }
}
