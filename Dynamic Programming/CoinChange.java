/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_pgm;

import java.util.Arrays;

/**
 *
 * @author itadmin17
 */
public class CoinChange {
    //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)
    public static long coin_change(int[] A,int n){
     long[] table = new long[n+1];
     Arrays.fill(table, 0);
     //base case(n=0) Bottom Up fashion
     table[0] = 1;
     for(int i=0;i<A.length;i++){
       for(int j=A[i];j<=n;j++) table[j]+= table[j-A[i]];
     }
     
     return table[n];
    }
    
    public static void main(String[] args) {
        System.out.println(""+coin_change(new int[]{1,2,3},4));
    }
}
