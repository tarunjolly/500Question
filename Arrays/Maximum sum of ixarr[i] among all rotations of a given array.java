import java.util.*;

public class Main{
   
public static void Maximum_sum_rotations_array(int []arr){
    
    //formula nextvalue=currentvalue-(cummulativevalue-arr[i-1])+arr[i-1]*(n-1);
    int n=arr.length;
    int cum_val=0;
    for(int i=0;i<n;i++){
        cum_val+=arr[i];
    }
    
    int curr_val=0;
    for(int i=0;i<n;i++){
        curr_val+=i*arr[i];
    }
    
    int next_val=0;
    int max=curr_val;
    for(int i=1;i<n;i++){
        next_val=curr_val-(cum_val-arr[i-1])+arr[i-1]*(n-1);
        
        curr_val=next_val;
        max=Math.max(max,next_val);
        
    }
    System.out.println(max);
    
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    Maximum_sum_rotations_array(arr);

 }
}