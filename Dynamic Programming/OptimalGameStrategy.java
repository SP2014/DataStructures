/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

import java.util.Arrays;

/**
 *
 * @author Ashish
 */
public class OptimalGameStrategy {
    public static int optimal_strategy(int[] arr){
      int n = arr.length;  
      int[][] tab = new int[n][n];
      for(int gap=0;gap<n;++gap){
       for(int i=0,j=gap;j<n;++i,++j){
         int x = ((i+2)<=j)?tab[i+2][j]:0;
         int y = ((i+1)<=(j-1))?tab[i+1][j-1]:0;
         int z = (i<=(j-2))?tab[i][j-2]:0;
         
           System.out.println("x: "+x+", y: "+y+", z: "+z);
         
         tab[i][j] = Math.max(arr[i]+Math.min(x,y), arr[j]+Math.min(y,z));
         
       }
      }
      
        System.out.println(Arrays.deepToString(tab));
        return tab[0][n-1];
    }
    
    public static void main(String[] args) {
        System.out.println(optimal_strategy(new int[]{5,3,7,10}));
    }
}
