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
public class MaximumProduct {
    
    public static int max(int a,int b,int c){
     if(a>b&&a>c) return a;
     if(b>a&&b>c) return b;
     return c;
    }
    
   // O(n^2) 
    public static int max_product(int n){
      int[] tab = new int[n+1];  
      tab[0]=tab[1] = 0;
      for(int i=1;i<=n;i++){
       int max_val = 0;   
       for(int j=1;j<=i/2;j++) max_val = max(max_val,(i-j)*j,j*tab[i-j]);
       tab[i] = max_val;
      }
      return tab[n];
    }
    
    public static void main(String[] args) {
        System.out.println(max_product(10));
    }
}
