package Microsoft;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashish
 */
public class SpiralOrderI {

    public static void printSpiral(int[][] A){
      int r = A.length;
      int c = A[0].length;
      int T = 0;
      int B = r-1;
      int L = 0;
      int R = c-1;
      int direction = 0;
      while(T<=B && L<=R){
       switch(direction){
           case 0:
               for(int i=L;i<=R;i++) System.out.println(A[T][i]+" ");
               T+=1;
               direction = 1;
               break;
           case 1:
               for(int i=T;i<=B;i++) System.out.println(A[i][R]+ " ");
               R-=1;
               direction = 2;
               break;
           case 2:
               for(int i=R;i>=L;i--) System.out.println(A[B][i]+" ");
               B-=1;
               direction = 3;
               break;
           case 3:
               for(int i=B;i>=T;i--) System.out.println(A[i][L]+" ");
               L+=1;
               direction =0;
               break;
               
       }
      }
    }
    
    public static void main(String[] args) {
        printSpiral(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    
}
