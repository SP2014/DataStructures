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
public class LongestPalindromeSubsequence {

    public static int LPS(String str,int start,int end){
  if(start==end) return 1; // There is only a single character
  if(str.charAt(start)==str.charAt(end)&&start+1==end) return 2; // If there are only two characters and both are same
  if(str.charAt(start)==str.charAt(end)) return 2+LPS(str,start+1,end-1); //If the last two characters match
  else return Math.max(LPS(str,start,end-1), LPS(str,start+1,end)); // If the last two characters don't match
}
    
   // Runtime: O(n^2) 
   public static int LPS_optimized(String str){
     int n = str.length();
     int[][] tab = new int[n][n];
     for(int i = 0;i<n;i++) tab[i][i] = 1;
     
     for(int cl=2;cl<=n;cl++){
      for(int i=0;i<n-cl+1;i++){
       int j = i+cl-1;
       if(str.charAt(i)==str.charAt(j)&&cl==2) tab[i][j] = 2;
       else if(str.charAt(i)==str.charAt(j)) tab[i][j] = 2+tab[i+1][j-1];
       else tab[i][j] = Math.max(tab[i][j-1], tab[i+1][j]);
      }
     }
     return tab[0][n-1];
   } 
  
    public static void main(String[] args) {
        //System.out.println(LPS("BCCB",0,3));
        System.out.println(LPS_optimized("BBABCBCAB"));
    }
}
