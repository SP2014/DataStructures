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
public class MaxSumRectange2D {
    
  public static int[] kadanes(int[] arr){
   int[] res = new int[]{Integer.MIN_VALUE,0,-1};
   int currentSum = 0;
   int startPoint = 0;
   for(int i =0;i<arr.length;i++){
    currentSum+=arr[i];
    if(currentSum<0){
      currentSum = 0;
      startPoint = i+1;
    }
    else if(currentSum>res[0]){
      res[0] = currentSum;
      res[1] = startPoint;
      res[2] = i;
    }
   } 
    //If all numbers are negative
    if(res[2]==-1){
      res[0]=0;
      for(int j=0;j<arr.length;j++){
       if(arr[j]>res[0]){
        res[0] = arr[j];
        res[1] = j;
        res[2] = j;
       }
      }
    }
   
   return res;
  }
    
  public static int maxSum(int[][] A){
    int cols = A[0].length;
    int rows = A.length;
    int top = 0;
    int left =0;
    int right = 0;
    int bottom = 0;
    int[] result;
    int maxSum = Integer.MIN_VALUE;
    for(int colLeft=0;colLeft<cols;++colLeft){
       int[] temp = new int[rows];
       int colRight = colLeft;
       for(;colRight<cols;++colRight){
         for(int i=0;i<rows;i++) temp[i] += A[i][colRight];
       }
       result = kadanes(temp);
       if(result[0]>maxSum){
        maxSum = result[0];
        top = result[1];
        bottom = result[2];
        left = colLeft;
        right = colRight;
       }
   
    }
    return maxSum;       
  }    
  
    public static void main(String[] args) {
        System.out.println(maxSum(new int[][]{{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,10,1,3},{-4,-1,1,7,-6}}));
    }
}
