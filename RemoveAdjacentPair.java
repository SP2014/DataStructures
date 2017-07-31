/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trieexample;

/**
 *
 * @author Ashish
 */
public class RemoveAdjacentPair {


    public static void main(String[] args) {
        System.out.println(RemovePair("ABCCBCBA".toCharArray()));
    }
    
    public static String RemovePair(char[] str){
     int i,j=0;
     int len = str.length-1;
     for(i=1;i<=len;i++){
       while((str[i]==str[j])&&(j>=0)){
        i++;
        j--;
       }
       str[++j] = str[i];
     }
     return new String(str);
   }
    
}
