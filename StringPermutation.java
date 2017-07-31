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
public class StringPermutation {

    public static void Permutations(int depth,char[] permutation,int[] used,char[] original){
      int length = original.length;
      if(depth==length) System.out.println(permutation);
      else{
        for(int i=0;i<length;i++){
          if(used[i]!=0){
             used[i] = 1;
             permutation[depth] = original[i];
             Permutations(depth+1,permutation,used,original);
          }
        }
      }
    }
    
    public static void main(String[] args) {
        Permutations(0,new char[20],new int[20],"aaa".toCharArray());
    }
    
}
