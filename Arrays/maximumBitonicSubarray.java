import java.util.*;

public class Main{

public static int maximumBitonicSubarray(int []arr){
    int n=arr.length;
    int left[]=new int[n];
    int right[]=new int[n];
    Arrays.fill(left,1);
    Arrays.fill(right,1);
    
    for(int i=1;i<n;i++){
        
        if(arr[i-1]<arr[i]){
            left[i]=left[i-1]+1;
        }
        
    }
    
    for(int i=n-2;i>=0;i--){
        
        if(arr[i+1]<arr[i]){
            right[i]=right[i+1]+1;
        }
        
    }
    
    int ans=left[0]+right[0]-1;
    for(int i=1;i<n;i++){
        ans=Math.max(ans,left[i]+right[i]-1);
    }
    return ans;
    
    
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    System.out.println(maximumBitonicSubarray(arr));
 }
}