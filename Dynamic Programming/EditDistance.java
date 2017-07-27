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
public class EditDistance {
    
    public int min(int a,int b,int c){
     if(a<b&&a<c) return a;
     else if(b<a&&b<c) return b;
     return c;
    }
    
    // O(3^m) complexity
    public int edit_distance(String str1,String str2,int m,int n){
     
        if(m==0) return n;
        if(n==0) return m;
        
        if(str1.charAt(m-1)==str2.charAt(n-1)) return edit_distance(str1,str2,m-1,n-1);
        return 1+min(edit_distance(str1,str2,m,n-1),edit_distance(str1,str2,m-1,n),edit_distance(str1,str2,m-1,n-1));
         
    }
    
    
    // O(mxn)
    public int edit_distance_optimized(String str1,String str2,int m,int n){
     int[][] tab = new int[m+1][n+1];
     for(int i=0;i<=m;i++){
       for(int j=0;j<=n;j++){
         if(i==0) tab[i][j] = n;
         else if(j==0) tab[i][j] = m;
         
         else if(str1.charAt(i-1)==str2.charAt(j-1)) tab[i][j] = tab[i-1][j-1];
         else tab[i][j] = 1+min(tab[i][j-1],tab[i-1][j],tab[i-1][j-1]);
       }
     }
      return tab[m][n];
    }
    
    public static void main(String[] args) {
        System.out.println(new EditDistance().edit_distance_optimized("sunday", "saturday", 6, 8));
    }
}
