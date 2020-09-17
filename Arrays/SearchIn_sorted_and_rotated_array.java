import java.util.*;

//finding pivot
//if value increase after mid then the pivot is at the left
//if value decrease after mid then the pivot is at the right
public class Main{
    
public static int binarySearch(int arr[],int start,int end,int x){
    
    while(start<=end){
        int mid=(start+end)/2;
        
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid]>x){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return -1;
}
    
public static int SearchIn_sorted_and_rotated_array(int []arr,int x){
    
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
    if(arr[pivot]==x){
        return pivot;
    }
    else{
        int ans1=binarySearch(arr,0,pivot-1,x);
        if(ans1!=-1){
            return ans1;
        }
        int ans2=binarySearch(arr,pivot+1,arr.length-1,x);
        if(ans2!=-1){
            return ans2;
        }
    }
    return -1;
    
    //System.out.println(pivot);
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    
    int k=scn.nextInt();
    System.out.println(SearchIn_sorted_and_rotated_array(arr,k));
    
    

 }
}