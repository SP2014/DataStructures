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
public class MinimumCostPath {
    
    public static int min(int a,int b,int c){
     if(a<b&&a<c) return a;
     else if(b<a&&b<c) return b;
     return c;
    }
    public static int min_path(int[][]A, int m,int n){
      if(m<0||n<0) return Integer.MAX_VALUE;
      else if(m==0&&n==0) return A[m][n];
      else return A[m][n]+min(min_path(A,m,n-1),min_path(A,m-1,n),min_path(A,m-1,n-1));
    }
    
    // Uses Dynaming programming
    public static int min_path_optimized(int[][]A, int m,int n){
     int i, j;
        int tc[][]=new int[m+1][n+1];
 
        tc[0][0] = A[0][0];
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + A[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + A[0][j];
 
        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = min(tc[i-1][j-1], 
                               tc[i-1][j],
                               tc[i][j-1]) + A[i][j];
 
        return tc[m][n];
    }
    
    
    public static void main(String[] args) {
        System.out.println(min_path_optimized(new int[][]{{1, 2, 3},
                      {4, 8, 2},
                      {1, 5, 3}},2,2));
    }
}
