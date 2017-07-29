/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microsoft;

/**
 *
 * @author Ashish
 */


public class MaxSumContigousSubarray {

 public static int maxSum(int[] A){
  int max_sum_so_far = Integer.MIN_VALUE;
  int max_ending_here = 0;
  for(int i=0;i<A.length;i++){
    max_ending_here+=A[i];
    if(max_sum_so_far<max_ending_here){
      max_sum_so_far = max_ending_here;
    }
    if(max_ending_here<0) max_ending_here = 0;
  }
  return max_sum_so_far;
 }
    
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,-3,2,1,-1}));
    }
}
