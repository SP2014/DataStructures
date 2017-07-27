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
public class BinomialCoefficient {

    public static int coeff(int n,int k){
     if(k==0||k==n) return 1;
     
     return coeff(n-1,k-1)+coeff(n-1,k);
    }
    
    public static int coeff_optimized(int n, int k){
        int C[][] = new int[n+1][k+1];
    int i, j;
     
        // Calculate  value of Binomial Coefficient in bottom up manner
    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= Math.min(i, k); j++)
        {
            // Base Cases
            if (j == 0 || j == i)
                C[i][j] = 1;
      
            // Calculate value using previosly stored values
            else
                C[i][j] = C[i-1][j-1] + C[i-1][j];
          }
     }
      
    return C[n][k];
    }
    
    // Run time: O(n*k) Space: O(n)
    public static int coeff_space_optimized(int n, int k){
     int C[] = new int[k+1];
    Arrays.fill(C, 0);
 
    C[0] = 1;  // nC0 is 1
 
    for (int i = 1; i <= n; i++)
    {
        // Compute next row of pascal triangle using
        // the previous row
        for (int j = Math.min(i, k); j > 0; j--)
            C[j] = C[j] + C[j-1];
    }
    return C[k];
    }
 
    public static void main(String[] args) {
        System.out.println(coeff_space_optimized(4,2));
    }
}
