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
public class SubsetSum {

    
    public static boolean hasSum(int[] A,int sum){
      int n = A.length;
      boolean[][] res = new boolean[n+1][sum+1];
      
      for(int i=0;i<=n;i++) res[i][0] = true;
      
      //for(int j=0;j<=sum;j++) res[0][j] = false;
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<=sum;j++){
          if(A[i-1]>j) res[i][j]=res[i-1][j];
          else{
            res[i][j] = res[i-1][j]==true?res[i-1][j]:res[i-1][j-A[i-1]];
          }
        }
      }
        System.out.println(Arrays.deepToString(res));
        return res[n][sum];
    }
    
    public static void main(String[] args) {
        System.out.println(hasSum(new int[]{3,34,4,12,5,2},9));
    }
}
