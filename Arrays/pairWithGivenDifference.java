import java.util.*;

public class Main{

public static void pairWithGivenDifference(int []arr,int diff){
    
    HashMap<Integer,Integer> hm=new HashMap<>();
    
    
    for(int i=0;i<arr.length;i++){
        if(!hm.containsKey(arr[i])){
            hm.put(arr[i],1);
        }
    }
    
    for(int i=0;i<arr.length;i++){
        
        int num=arr[i];
        
        if(hm.containsKey(diff+num)){
            System.out.println(num+" "+(diff+num));
            return;
            
        }
        
    }
    
    System.out.println("No Such Pair");
    
    
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    int diff=scn.nextInt();
    pairWithGivenDifference(arr,diff);
    
    

 }
}