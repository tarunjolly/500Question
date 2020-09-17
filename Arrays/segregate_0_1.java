import java.util.*;

public class Main{

public static void segregate_0_1(int []arr){
    
    int n=arr.length;
    int i=0;
    int j=n-1;
    
    while(i<j){
        
        if(arr[i]==0){
            i++;
        }
        else if(arr[j]==1){
            j--;
        }else{
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        
        
    }
    
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    segregate_0_1(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
 }
}