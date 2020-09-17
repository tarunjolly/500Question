import java.util.*;

//finding pivot
//if value increase after mid then the pivot is at the left
//if value decrease after mid then the pivot is at the right
public class Main{
   
public static int pair_with_given_sum_in_sorted_rotated_array(int []arr,int sum){

    //finding pivot;
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int mid=(start+end)/2;
        if(arr[mid]<arr[end])
        {
            end=mid;
        }else{
            start=mid+1;
        }
    }
    
    int pivot=end;
    int l=(arr.length+end-1)%arr.length;
    int s=end;
    
    //l means largest element index
    //s means smallest element index
    
    while(s!=l ){
        
        if(arr[s]+arr[l]==sum){
            return 1;
        }
        
        if(arr[s]+arr[l]<sum){
            s=(s+1)%arr.length;
        }
        
        if(arr[s]+arr[l]>sum){
            l=(arr.length+l-1)%arr.length;
        }
        
        
    }
    return -1;
    
    
    
    
      
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    
    int sum=scn.nextInt();
    System.out.println(pair_with_given_sum_in_sorted_rotated_array(arr,sum));
    
    

 }
}