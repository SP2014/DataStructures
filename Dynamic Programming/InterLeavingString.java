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
public class InterLeavingString {

    public static boolean isInterLeaved(char[] A,char[] B, char[] C){
    
        // Length of strings
        int m = A.length;
        int n = B.length;
        
        boolean[][] tab = new boolean[m+1][n+1];
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++) tab[i][j] = false;
        
        if(C.length!=m+n) return false;
        
        for(int i=0;i<=m;++i){
         for(int j=0;j<=n;++j){
          if(i==0&&j==0) tab[i][j] = true;
          
          // If A is Empty
          else if(i==0&&B[j-1]==C[j-1]) tab[i][j] = tab[i][j-1];
          
          // If B is Empty
          else if(j==0&&A[i-1]==C[i-1]) tab[i][j] = tab[i-1][j];
          
          // Current character of C matches with current character of A,
            // but doesn't match with current character of B
            else if(A[i-1]==C[i+j-1] && B[j-1]!=C[i+j-1])
                tab[i][j] = tab[i-1][j];
 
            // Current character of C matches with current character of B,
            // but doesn't match with current character of A
            else if (A[i-1]!=C[i+j-1] && B[j-1]==C[i+j-1])
                tab[i][j] = tab[i][j-1];
 
            // Current character of C matches with that of both A and B
            else if (A[i-1]==C[i+j-1] && B[j-1]==C[i+j-1])
                tab[i][j]=(tab[i-1][j] || tab[i][j-1]) ;
          
         }
        }
        System.out.println(Arrays.deepToString(tab));  
      return tab[m][n];
    }
    
    public static void main(String[] args) {
        System.out.println(isInterLeaved("XY".toCharArray(),"WZ".toCharArray(),"WZXY".toCharArray()));
    }
    
}
