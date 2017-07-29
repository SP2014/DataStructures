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
public class MedianOfArray {

    public static double medianArray(int[] A,int[] B){
      int total = A.length+B.length;
      if(total%2==0){
          return (findKth(total/2+1,A,B,0,0)+findKth(total/2,A,B,0,0))/2.0;
      }else{
        return findKth(total/2+1,A,B,0,0);
      }
    }
    
    public static double findKth(int k,int[] A,int[] B,int s1,int s2){
     if(s1>=A.length) return B[s2+k-1];
     
     if(s2>=B.length) return A[s1+k-1];
     
     if(k==1) return Math.min(A[s1], B[s2]);
     
     int m1 = s1+k/2-1;
     int m2 = s2+k/2-1;
        System.out.println("m1: "+m1+" ,m2: "+m2+"\n");
     
     int mid1 = m1<A.length?A[m1]:Integer.MAX_VALUE;
     int mid2 = m2<B.length?B[m2]:Integer.MAX_VALUE;
     
        System.out.println("mid1: "+mid1+", mid2: "+mid2+"\n");
     
     if(mid1<mid2){
       return findKth(k-k/2,A,B,m1+1,s2);
     }
     
     return findKth(k-k/2,A,B,s1,m2+1);
    
    }
    
    public static void main(String[] args) {
        System.out.println(medianArray(new int[]{1,4,5},new int[]{2,3}));
    }
}
