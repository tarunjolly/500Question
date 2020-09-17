import java.util.*;

public class Main{
    

public static int trapingRainWater(int []arr){
    
    int n=arr.length;
    //left highest
    int left[]=new int[n];
    //right highest
    int right[]=new int[n];
    
    left[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        left[i]=Math.max(left[i-1],arr[i]);
    }
    
    right[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
        right[i]=Math.max(right[i+1],arr[i]);
    }
    
    int water=0;
    for(int i=0;i<arr.length;i++){
        
        water=water+ Math.min(left[i],right[i])-arr[i];
        
    }
    return water;    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    
    
    System.out.println(trapingRainWater(arr));
    
    

 }
}