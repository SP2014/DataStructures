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
public class RodCutting {
    public static int rod_cut(int[] P,int n){
     if(n<=0) return 0; // Base condition
     int max = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
       max = Math.max(max, P[i]+rod_cut(P,n-i-1));
         //System.out.println(i+": "+max);
     }
     return max;
    }
    
    static int rod_cut_optimized(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0] = 0;
 
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val,price[j] + val[i-j-1]);
                System.out.println(max_val+"\n");
            val[i] = max_val;
        }
 
        return val[n];
    }
    
    public static void main(String[] args) {
        System.out.println(rod_cut(new int[]{1,5,8,9,10,17,17,20},8));
    }
    
}
