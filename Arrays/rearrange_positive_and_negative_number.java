import java.util.*;

public class Main{
   
public static void rearrange_positive_and_negative_number(int []arr){
    int i=-1;
    
    int count=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]<0){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
    
    int neg=0;
    int pos=i+1;
    while(neg<arr.length && neg<pos && arr[neg]<0){
        
        int temp=arr[pos];
        arr[pos]=arr[neg];
        arr[neg]=temp;
        neg+=2;
        pos+=1;
        
    }
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
    
    rearrange_positive_and_negative_number(arr);
    for(int i=0;i<n;i++)
    System.out.println(arr[i]);

 }
}