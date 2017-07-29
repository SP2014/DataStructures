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
public class Square_root {

    public static int sqrt(int a){
      if(a==0||a==1) return a;
      int low = 1;
      int high = a;
      int root=0;
      
      while(low<=high){
       int mid = (low+high)/2;
       if(mid==a/mid&&(a%mid==0)) return mid;
       if(mid<=a/mid){
       root = mid;
       low = mid+1;
       }else{
        high=mid-1;
       }
      }
      return root;
    }
    
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
    
}
