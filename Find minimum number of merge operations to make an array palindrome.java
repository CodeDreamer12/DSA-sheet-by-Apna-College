import java.util.*;
public class Main
{
    public static int minOps(int arr[], int n){
        int ans=0;
        for(int i=0, j=n-1; i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[j]=arr[j]+arr[j+1];
                ans++;
            }
            else{
                i++;
                arr[i]=arr[i]+arr[i-1];
                ans++;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++){
		    arr[i]=s.nextInt();
		}
		System.out.println(minOps(arr,n));
	}
}
