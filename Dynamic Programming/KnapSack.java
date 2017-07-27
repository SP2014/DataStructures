/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_pgm;

/**
 *
 * @author itadmin17
 */
public class KnapSack {
  public static int knap_sack(int capacity,int[] wgt,int[] val,int n){
   // Base case
   if(capacity==0||n==0) return 0;
   
   // If n-1 value is larger than the given capacity
   if(wgt[n-1]>capacity) return knap_sack(capacity,wgt,val,n-1);
   
   else return Math.max(val[n-1]+knap_sack(capacity-wgt[n-1],wgt,val,n-1), knap_sack(capacity,wgt,val,n-1));
  }   
  
  // Run time: O(nW)
  public static int knap_sack_optimized(int capacity,int[] wgt, int[] val,int n){
   int[][] tab = new int[n+1][capacity+1];
   for(int i=0;i<=n;i++){
    for(int j=0;j<=capacity;j++){
     if(i==0||j==0) tab[i][j] = 0;
     else if(wgt[i-1]<=j) tab[i][j] = Math.max(val[i-1]+tab[i-1][j-wgt[i-1]], tab[i-1][j]);
     else tab[i][j] = tab[i-1][j];
    }
   }
   return tab[n][capacity];
  }
  
    public static void main(String[] args) {
        System.out.println(knap_sack_optimized(50,new int[]{10,20,30},new int[]{60,100,120},3));
    }
  
}
