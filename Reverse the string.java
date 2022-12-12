

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String newStr="";
        for(int i=str.length()-1; i>=0; i--){
            newStr=newStr+str.charAt(i);
        }
        return newStr;
    }
}
