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
 * Given any array whose values represent the cost, find minimum cost to reach from start to end
 * Eg: [1,3,6] => 2
 */
public class MinimumJumpsEnd {
    
    
    public static int jump(int[] A,int l, int h){
     if(l==h) return 0; // If start and end is same
     if(A[l]==0) // There are no reachable elements from that node
         return Integer.MAX_VALUE;
     
     int min = Integer.MAX_VALUE;
     for(int i=l+1;i<=h&&i<=l+A[l];i++){
       int jumps = jump(A,i,h);
       if(jumps!=Integer.MAX_VALUE&&jumps<1+min) min=jumps+1;
     }
     return min;
    }
    
    
    public static int jump_optimized(int[] A,int n){
     int i,j;
     int[] jumps = new int[n];
     if(n==0||A[0]==0) return Integer.MAX_VALUE;
     jumps[0] = 0;
     //Arrays.fill(jumps,Integer.MAX_VALUE);
     for(i=1;i<n;i++){
         jumps[i] = Integer.MAX_VALUE;
      for(j=0;j<i;j++){
        if(i<=j+A[j]&&jumps[j]!=Integer.MAX_VALUE){
          jumps[i] = Math.min(jumps[i], jumps[j]+1);
          break;
        }
      }
     }
     
    return jumps[n-1];
    }
    
    
    public static void main(String[] args) {
        System.out.println(jump_optimized(new int[]{1, 3, 6, 1, 0, 9},6));
    }
    
}
