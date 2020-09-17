import java.util.*;

public class Main{
    

public static int minimumNumberOfPlatform(int []arr,int[] dep){
    int count=1;
    int platform_needed=1;
    int i=1;
    int j=0;
    while(i<arr.length && j<dep.length ){
        if(arr[i]<=dep[j]){
            i++;
            count++;
        }
        else{
            j++;
            count--;
        }
        if(count>platform_needed){
            platform_needed=count;
        
        }
        
        
        
    }
    
    
        
    return platform_needed;
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    int dep[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    for(int i=0;i<n;i++)
    dep[i]=scn.nextInt();
    
    
    System.out.println(minimumNumberOfPlatform(arr,dep));
    
    

 }
}