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
public class MinimimInsertionPallindrome {
  public static int minInsertion(char[] str){
    int n = str.length;  
    int[][] tab = new int[n][n];
    for(int i=0;i<tab.length;i++) for(int j=0;j<tab[i].length;j++) tab[i][j] = 0;
    
    for(int gap=1;gap<n;++gap){
      for(int l=0,h=gap;h<n;++h,++l){
        tab[l][h] = (str[l]==str[h])?tab[l+1][h-1]:Math.min(tab[l+1][h],tab[l][h-1])+1;
      }
    }
    return tab[0][n-1];
  }    
  
    public static void main(String[] args) {
        System.out.println(minInsertion("abc".toCharArray()));
    }
}
