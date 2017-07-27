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



public class LongestIncreasingSubsequence {
    public int LIS(int[] A,int n){
     int[] lis = new int[n];
     Arrays.fill(lis, 1);
     for(int i=1;i<n;i++){
      for(int j=0;j<i;j++){
       if(A[i]>A[j]&&lis[i]<lis[j]+1) lis[i] = lis[j]+1;
      }
     }
     
     int max = lis[0];
     for(int k=1;k<n;k++){
      if(lis[k]>max) max = lis[k];
     }
     return max;
    }
    
    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        System.out.println(lis.LIS(new int[]{3, 10, 2, 1, 20}, 5));
    }
    
}


