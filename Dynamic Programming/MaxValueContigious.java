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
public class MaxValueContigious {
   
    // O(n) complexity, O(n) Space
    public static int maxValue(int[] A,int n){
      int[] M = new int[n+1];
      M[n] = 0; 
      if(A[0]>0) M[0] = A[0];
      else M[0] = 0;
      for(int i=1;i<n;i++){
        if((M[i-1]+A[i])>0){
          M[i] = M[i-1]+A[i];
        }
        else M[i] = 0;
      }
      
      int max = M[0];
      for(int k = 0;k<n;k++){
       if(M[k]>max) max = M[k];
      }
      
      return max;
    }
    
    
    public static void main(String[] args) {
        //System.out.println(maxValue(new int[]{-2,11,-4,13,-5,2},6));
        System.out.println(maxValue(new int[]{1,-3,4,-2,-1,6},6));
    }
    
}
