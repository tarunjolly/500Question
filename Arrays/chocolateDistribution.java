import java.util.*;

public class Main{

public static int chocolateDistribution(int []arr,int m){
    
     Arrays.sort(arr);
    // for(int i=0;i<arr.length;i++)
    // System.out.print(arr[i]+" ");
    
    int diff=Integer.MAX_VALUE;
    for(int i=0;i<arr.length-m;i++){
        diff=Math.min(diff,arr[i+m-1]-arr[i]);
    }
    return diff;
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    int m=scn.nextInt();
    System.out.println(chocolateDistribution(arr,m));
    
    

 }
}