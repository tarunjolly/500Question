import java.util.*;

public class Main{
   
public static void three_way_partitioning_of_array_around_range(int []arr,int lowval,int highval){
    int start=0;
    int end=arr.length-1;
    for(int i=0;i<=end;){
        
        if(arr[i]<lowval){
            int temp=arr[i];
            arr[i]=arr[start];
            arr[start]=temp;
            start++;
            i++;
        }
        
        else if(arr[i]>highval){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
        else{
            i++;
        }
        
    }
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    int lowval=scn.nextInt();
    int highval=scn.nextInt();
    
    three_way_partitioning_of_array_around_range(arr,lowval,highval);
    for(int i=0;i<n;i++)
    System.out.println(arr[i]);

 }
}