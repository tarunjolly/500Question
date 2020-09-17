import java.util.*;

public class Main{

public static int maximumSumIncreasingSubsequence(int []arr){
    
    int dp[]=new int[arr.length];
    
    for(int i=0;i<arr.length;i++){
        dp[i]=arr[i];
    }
    dp[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        //int max=arr[i];
        for(int j=0;j<i;j++){
            
            if(arr[j]<arr[i] && dp[i]<dp[j]+arr[i]){
                dp[i]=arr[i]+dp[j];
            }
            
        }
     //   dp[i]=dp[i]+max;
    }
    
    int ans=0;
    for(int i=0;i<arr.length;i++){
        ans=Math.max(ans,dp[i]);
    }
    return ans;
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    System.out.println(maximumSumIncreasingSubsequence(arr));
 }
}