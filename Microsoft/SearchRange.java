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
public class SearchRange {
   public static int[] searchRange(int[] A,int target){
    if(A==null||A.length==0) return null;
    int[] res = new int[]{-1,-1};
    bSearch(A,0,A.length-1,target,res); 
    return res;
   } 
   
   public static void bSearch(int[] A,int l,int r,int target,int[] res){
       if(r<l) return;
       
       if(A[l]==A[r]&&A[l]==target) {res[0]=l;res[1]=l; return;}
       
       int mid = l+(r-l)/2;
       if(A[mid]<target){
       
       }else if(A[mid]>target){
       
       }
       else{
         
       }
       
       
   
   }
}
