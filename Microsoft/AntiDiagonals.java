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
public class AntiDiagonals {
  public static void printDiagonals(int[][] A){
   int R = A.length;
   int C = A[0].length;
   
   int i = 0,j=0;
   
   for(i=0;i<C;i++){
     int p=0;
     int q=i;
     while(p<R&&q>=0){
         System.out.println(A[p][q]);
         p++;q--;
         
     }
   }
   
   for(i=1;i<R;i++){
    int p = i;
    int q = C-1;
    while(p<R&&q>=1){
        System.out.println(A[p][q]);p++;q--;
    }
   }
   
  }
  
    public static void main(String[] args) {
        printDiagonals(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
  
}
