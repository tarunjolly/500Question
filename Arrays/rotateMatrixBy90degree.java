import java.util.*;
//Stock Buy Sell to Maximize Profit

public class Main{
    

public static void rotateMatrixBy90degree(int [][]arr){
    int n=arr.length;
    //diagonal traversal and swapping
    for(int gap=0;gap<arr.length;gap++){
        
        for(int i=0;i<arr.length-gap;i++){
            int j=gap+i;
            //swap
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
        
    }
    
    //reverse columnwise
    for(int k=0;k<n;k++){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i][k];
            arr[i][k]=arr[j][k];
            arr[j][k]=temp;
            i++;
            j--;
        }
        
    }
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[][]=new int[n][n];
    
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            arr[i][j]=scn.nextInt();
    
    
    rotateMatrixBy90degree(arr);
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    

 }
}