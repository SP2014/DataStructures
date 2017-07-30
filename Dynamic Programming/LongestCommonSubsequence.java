/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

/**
 *
 * @author Ashish
 */
public class LongestCommonSubsequence {


    // Recursive approach, O(2^n) complexity[Worst case, when no match found]
    public static int lcs(char[] str1,char[] str2,int m,int n){
      if(m==0||n==0) return 0;
      if(str1[m-1]==str2[n-1]) return 1+lcs(str1,str2,m-1,n-1);
      else return max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
    }
    
    
    // Dynamic approach using Memoziation
    public static int lcs_dynamic(char[] str1,char[] str2,int m,int n){
     int table[][] = new int[m+1][n+1];
     for(int i=0;i<=m;i++){
      for(int j=0;j<=n;j++){
        if(i==0||j==0) table[i][j] = 0;
        else if(str1[i-1]==str2[j-1]) table[i][j] = 1+table[i-1][j-1];
        else table[i][j] = max(table[i-1][j],table[i][j-1]);
      }
     }
     return table[m][n];
    }
    
    
    public static int max(int a,int b){
     return (a>b)?a:b;
    }
    
    public static void main(String[] args) {
        //System.out.println(lcs("ABCBDAB".toCharArray(),"BDCABA".toCharArray(),7,6));
        System.out.println(lcs_dynamic("ABCBDAB".toCharArray(),"BDCABA".toCharArray(),7,6));
    }
}
