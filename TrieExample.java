/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trieexample;

import java.util.Arrays;

/**
 *
 * @author Ashish
 */

class TrieNode{
 char value;   
 TrieNode[] child;// Child of each node
 boolean isEnd;
 public TrieNode(char c){
   this.child = new TrieNode[26];// Since it consists of english aplhabets
   Arrays.fill(child, null);
   this.value = c;
   this.isEnd = false;
 }
 
 public TrieNode subNode(char c){
     if(this.child!=null){
      int index = c-'a';
      return this.child[index];
     }
     return null;
 }
 
}


class Trie{
  TrieNode root;
  
  public Trie(){
   root = new TrieNode(' ');
  }
  
      // Inserts a word into the trie.
    public void insert(String word) {
      if(search(word)) return;
      TrieNode current = root;
      for(char c:word.toCharArray()){
          //System.out.println(c);   
       TrieNode child = current.subNode(c);
       if(child!=null) current = child;
       else{
          int index = c-'a'; 
         current.child[index] = new TrieNode(c);
         current = current.child[index];
       }
      }
      current.isEnd = true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
       TrieNode current = root;
       for(char c:word.toCharArray()){
         if(current.subNode(c)==null) return false;
         else current = current.subNode(c);
       }
       if(current.isEnd) return true;
       return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.child[index]!=null){
                p = p.child[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
}

public class TrieExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trie trie = new Trie();
        trie.insert("this");
        trie.insert("is");
        trie.insert("a");
        trie.insert("career");
        trie.insert("monk");
        //TrieNode node = new TrieNode(' ');
        
        System.out.println(trie.search("monk"));
        
    }
    
}
