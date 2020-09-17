import java.util.*;

public class Main{
    static class  pair implements Comparable<pair>{
        
        int i;
        int j;
        int sum;
        pair(int i,int j,int sum){
            this.i=i;
            this.j=j;
            this.sum=sum;
        }
        
        public int compareTo(pair other){
            return this.sum-other.sum;
        }
    }

public static void k_pairsWithSmallestSum(int []arr1,int []arr2,int k){
    PriorityQueue<pair> pq=new PriorityQueue<>();
    int i=0;
    int j=0;
    pair ab=new pair(0,0,arr1[0]+arr2[0]);
    pq.add(ab);
    
    while(k>0)
    {
       pair curr=pq.remove();
       
       pq.add( new  pair(curr.i+1,curr.j,arr1[curr.i+1]+arr2[curr.j]));
       pq.add( new  pair(curr.i,curr.j+1,arr1[curr.i]+arr2[curr.j+1]));
       
       System.out.println(arr1[curr.i]+" "+arr2[curr.j]);
       
        
       k--;
        
    }
}

public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    for(int i=0;i<n;i++)
        arr1[i]=scn.nextInt();
    
    for(int i=0;i<n;i++)
        arr2[i]=scn.nextInt();
    
    int k=scn.nextInt();
    k_pairsWithSmallestSum(arr1,arr2,k);
    
    

 }
}