class Solution {
    public boolean isPalindrome(String s) {
      String org="";
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
              org+=s.charAt(i);
          }
          if(s.charAt(i)>='a' && s.charAt(i)<='z'){
              org+=s.charAt(i);
          }
          if(s.charAt(i)>='0' && s.charAt(i)<='9'){
              org+=s.charAt(i);
          }
      }
      String ans=org.toLowerCase();
      String res="";
      for(int i=ans.length()-1; i>=0; i--){
          res+=ans.charAt(i);
      }
      boolean flag=true;
      for(int i=0; i<ans.length(); i++){
          if(res.charAt(i)!=ans.charAt(i)){
              flag=false;
              break;
          }
      }
      if(flag){
          return true;
      }
      else{
          return false;
      }

        
    }
}
