import java.util.*;

public class Main{

public static void zigzagArray(int []arr){
    
    for(int i=1;i<arr.length;i+=2){
        
        if(arr[i]<arr[i-1]){
            //swap;
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            
        }
        
        if(arr[i]<arr[i+1]){
            //swap;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
        
    }
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    
    zigzagArray(arr);
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
 }
}