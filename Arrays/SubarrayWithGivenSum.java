import java.util.*;

public class Main{

public static void SubArrayWithGivenSum(int []arr,int sum){
    
    
    int start=0;
    int end=-1;
    int tar=0;
    for(int i=0;i<arr.length;i++){
        
        if(tar<sum){
            tar+=arr[i];
            end++;
        }
        
        if(tar==sum){
            break;
        }
        
        if(tar>sum){
            while(tar>sum){
                tar-=arr[start];
                start++;
            }
        }
        
    }
    
    System.out.println(start+" "+end);
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    int sum=scn.nextInt();
    SubArrayWithGivenSum(arr,sum);
 }
}