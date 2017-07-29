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
public class SpiralOrder2 {
    
    public static void printSpiral(int n){

      int total = n*n;
      int[][] res = new int[n][n];
      int x=0,y=0;
      int step = 0;
        for(int i=0;i<total;){
        while(y+step<n){
            i++;
            res[x][y]=i; 
            y++;
 
        }    
        y--;
        x++;
 
        while(x+step<n){
            i++;
            res[x][y]=i;
            x++;
        }
        x--;
        y--;
 
        while(y>=0+step){
            i++;
            res[x][y]=i;
            y--;
        }
        y++;
        x--;
        step++;
 
        while(x>=0+step){
            i++;
            res[x][y]=i;
            x--;
        }
        x++;
        y++;
    }
        System.out.println(Arrays.deepToString(res));
    }
    
    public static void main(String[] args) {
        printSpiral(3);
    }
    
}
