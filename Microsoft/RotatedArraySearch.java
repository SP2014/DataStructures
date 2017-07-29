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
public class RotatedArraySearch {

    public static int search(int[] A,int b){
      if(A==null||A.length==0||b==0) return 0;
      return binarySearch(A,0,A.length-1,b);
    }
    
    public static int binarySearch(int[] A,int start,int end,int target){
     if(start>end) return -1;
     int mid = start+(end-start)/2;
     if(target==A[mid]) return mid;
     if(A[start]<=A[mid]){
       if(A[start]<=target&&target<A[mid]){
        return binarySearch(A,start,mid-1,target);
       }
       else{
        return binarySearch(A,mid+1,end,target);
       }
     }else{
       if(A[mid]<target&&target<=A[end]) return binarySearch(A,mid+1,end,target);
       else return binarySearch(A,start,mid-1,target);
     }
    }
    
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},4));
    }
    
}
