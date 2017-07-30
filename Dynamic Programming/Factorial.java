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
public class Factorial {
  public static int[] facto;
  
  // O(n) complexity
  public static int factorial(int n){
   if(n==1||n==0) return 1;
   if(facto[n]!=0) return facto[n];
   else return facto[n] = n*factorial(n-1);
  }
  
    public static void main(String[] args) {
        facto = new int[6];
        System.out.println(factorial(3));
    }
  
}
