import java.util.*;
//Stock Buy Sell to Maximize Profit

public class Main{
    

public static int buyAndSellStock(int []arr){
    
    int n=arr.length;
    int bd=0;//buy date
    int sd=0;//sell date
    int profit=0;
    int op=0;
    for(int i=1;i<n;i++){
        
        if(arr[i]>arr[i-1]){
            sd=i;
        }else{
            profit+=arr[sd]-arr[bd];
            bd=i;
            sd=i;
            
        }
        
    }
    
    
    profit+=arr[sd]-arr[bd];
    
    return profit;
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    
    
    System.out.println(buyAndSellStock(arr));
    
    

 }
}