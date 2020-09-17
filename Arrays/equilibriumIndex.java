import java.util.*;

public class Main{

public static int equilibriumIndex(int []arr){
    
    int right=0;
    int left=0;
    
    for(int i=0;i<arr.length;i++){
        right+=arr[i];
    }
    
    for(int i=0;i<arr.length;i++){
        
        right-=arr[i];
        
        if(left==right){
            return i;
        }
        
        left+=arr[i];
        
    }
    return -1;
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    System.out.println(equilibriumIndex(arr));
 }
}