/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashish
 */
public class KMP {

    public static int[] createLPSArray(String pattern){
      int n = pattern.length();  
      int[] lps = new int[n];
      lps[0] = 0;
      int len = 0;
      int i = 1;
      while(i<n){
        if(pattern.charAt(i)==pattern.charAt(len)){
         len++;
         lps[i] = len;
         i++;
        }
        else{
          if(len!=0){
            len = lps[len-1];
          }
          else{
            lps[i]=0;
            i++;
          }
        }
      }
      return lps;
    }
    
    public static void KMPSearch(String text,String pattern){
     int n = text.length();
     int m = pattern.length();
     int[] lps = createLPSArray(pattern);
     int i=0,j=0;
     while(i<n){
      if(pattern.charAt(j)==text.charAt(i)){
       j++;
       i++;
      }
      
      if(j==m){
          System.out.println("Found at index: "+(i-j));
          j=lps[j-1];
      }
      else if(i<n && pattern.charAt(j)!=text.charAt(i)){
        if(j!=0){
            j = lps[j-1];
        }
        else{
          i++;
        }
      }
      
     }
    }
    
    public static void main(String[] args) {
        KMPSearch("ABXABABXAB","ABXAB");
    }
    
}
