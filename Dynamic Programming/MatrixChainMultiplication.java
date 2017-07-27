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
public class MatrixChainMultiplication {
    
    public static int MCM(int[] P,int i,int j){
      if(i==j) return 0;
      
      int min = Integer.MAX_VALUE;
      for(int k=i;k<j;k++){
       int count = MCM(P,i,k)+MCM(P,k+1,j)+(P[i-1]*P[k]*P[j]);
          System.out.println(k+" Count: "+count);
          if(count<min){
           min = count;
          }
      }
     return min;
    }
    
    // Runtime: O(n^3) Space: O(n^2)
    public static int MCM_optimized(int[] p,int n){
     int[][] m = new int[n][n];
     
     for(int i=1;i<n;i++) m[i][i]=0;
     
     for (int L=2; L<n; L++)
        {
            for (int i=1; i<n-L+1; i++)
            {
                int j = i+L-1;
                if(j == n) continue;
                m[i][j] = Integer.MAX_VALUE;
                for (int k=i; k<=j-1; k++)
                {
                    // q = cost/scalar multiplications
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }
 
        return m[1][n-1];
     
    }
    
    public static void main(String[] args) {
        int c = MCM_optimized(new int[]{1, 2, 3, 4, 3},5);
        System.out.println("Result: "+c);
        
    }
    
}
