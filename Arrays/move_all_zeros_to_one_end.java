import java.util.*;

public class Main{
   
public static void move_all_zeros_to_one_end(int []arr){
    
    int count=0;
    for(int i=0;i<arr.length;i++){
        
        if(arr[i]!=0){
            arr[count++]=arr[i];
        }
        
    }
    int i=0;
    while(count<arr.length){
        arr[count]=0;
        count++;
    }
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    
    
    move_all_zeros_to_one_end(arr);
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
    
    

 }
}