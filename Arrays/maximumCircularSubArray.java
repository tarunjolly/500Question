import java.util.*;

public class Main{

public static int maximumCircularSubArray(int []arr){
    
    //min kadane
    //max kadane
    //sum of all elements
    int min_so_far=0,max_so_far=0,curr_min=0,curr_max=0,sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        curr_max=Math.max(curr_max+arr[i],arr[i]);
        
        curr_min=Math.min(curr_min+arr[i],arr[i]);

        if(curr_max>max_so_far)
        max_so_far=curr_max;
        
        if(curr_min<min_so_far)
        min_so_far=curr_min;
        
            
    }
    
    return Math.max(max_so_far,sum-min_so_far);
     
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    System.out.println(maximumCircularSubArray(arr));
 }
}