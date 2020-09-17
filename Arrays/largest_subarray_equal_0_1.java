import java.util.*;

public class Main{

public static void LargestSubarray_equal_0_1(int []arr){
    
    int n=arr.length;
    int startIndex=-1;
    int endIndex=-1;
    int maxSize=0;
    int sum=0;
    for(int i=0;i<n;i++){
        if(arr[i]==1){
            sum=1;
        }else{
            sum=-1;
        }
        for(int j=i+1;j<n;j++){
            if(arr[j]==1)
            sum+=1;
            else
            sum+=-1;
            
            if(sum==0){
                
                if(j-i+1>maxSize){
                    startIndex=i;
                    maxSize=j-i+1;
                }
                
            }
            
        }
        
    }
    endIndex=startIndex+maxSize-1;
    System.out.println(startIndex+" "+endIndex);
    
    
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    LargestSubarray_equal_0_1(arr);
 }
}