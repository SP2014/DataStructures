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
public class LongestCommonSubstring {
  public static int lcS(char[] str1, char[] str2){
    int m = str1.length;
    int n = str2.length;
    
    int[][] tab = new int[m+1][n+1];
    int result = Integer.MIN_VALUE;
    for(int i=0;i<=m;i++){
      for(int j=0;j<=n;j++){
        if(i==0||j==0) tab[i][j] = 0;
        else if(str1[i-1]==str2[j-1]){ 
            tab[i][j] = 1+tab[i-1][j-1];
            result = Math.max(result, tab[i][j]);
        }
        else tab[i][j] = 0;
        
      }
    }
    
      System.out.println(Arrays.deepToString(tab));
      return result;
    
  }    
  
    public static void main(String[] args) {
        System.out.println(lcS("OldSite:GeeksforGeeks.org".toCharArray(),"NewSite:GeeksQuiz.com".toCharArray()));
    }
}
