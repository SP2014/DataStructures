/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microsoft;

import java.util.Arrays;

/**
 *
 * @author Ashish
 */
public class NextPermutation {

    public static void printNextPermutation(int[] A){
     int n = A.length;
     int k = -1;
     int l = 0;
     for(int i=0;i<n-1;i++) if(A[i]<A[i+1]) k = i;
     
     if(k==-1) Arrays.sort(A); System.out.println(Arrays.toString(A));
     
     for(int i = k+1;i<n;i++){
      if(A[i]>A[k]) l = i;
     }
     
     int temp = A[l];
     A[l] = A[k];
     A[k] = temp;
     
     int j=k+1;
     int last=n-1;
     while(j<=last){
      int t2 = A[j];
      A[j] = A[last];
      A[last] = t2;
      j++;
      last--;
     }
        System.out.println(Arrays.toString(A));
    }
    
    public static void main(String[] args) {
        printNextPermutation(new int[]{3,2,1});
    }
    
}
