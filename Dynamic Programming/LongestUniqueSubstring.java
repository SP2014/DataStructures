/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

import java.util.Arrays;

/**
 *
 * @author Ashish
 */
public class LongestUniqueSubstring {
    
  public static int longestString(String str){
    int n = str.length();
    int cur_length=1; // Length of current string
    int max_length=1;
    int[] chars = new int[256];// Array of unique characters
    Arrays.fill(chars, -1);
    chars[str.charAt(0)] = 0; // Visit the first character
    
    for(int i = 1;i<n;i++){
        int index = chars[str.charAt(i)];
        // If the current character is not visited or is not the part of NRC (All the previous characters are unique)
        if(index==-1||i-cur_length>index) cur_length++;
        // If the current character is already present in the substring being considerd
        else{
           if(cur_length>max_length) max_length = cur_length;
           
           cur_length = i-index;
            System.out.println(cur_length);
        }
        // Update the index of current character
        chars[str.charAt(i)] = i;
    }
    
    if(cur_length>max_length) max_length = cur_length;
  
    return max_length;
  }
  
    public static void main(String[] args) {
        System.out.println(longestString("ABDEFGABEF"));
    }
}
