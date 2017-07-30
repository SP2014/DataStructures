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
public class Fibonacci {
    public static int[] fib;
    // Create an array for memoization
    static int[] f = new int[1000];
    
    
    public static void main(String[] args) {
        fib = new int[10];
        //System.out.println(FibBottomToTop(7));
        //System.out.println(FibTopToBottom(7));
        System.out.println(Fibonacci(7));
    }

    // Bottom Up approach O(n)
    public static int FibBottomToTop(int n){
        //Check for base cases
        if(n==0||n==1) return 1;
        fib[0] = 1;
        fib[1] =1;
        for(int i=2;i<n;i++){
          fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n-1];
    }
    
    // Top Down approach O(n) runtime, O(n) space
    public static int FibTopToBottom(int n){
     if(n==1) return 1;
     if (n==2) return 1;
     if(fib[n]!=0) return fib[n];
     
     return fib[n] = FibTopToBottom(n-1)+FibTopToBottom(n-2);
    }
    
    // O(n) run time, O(1) space
    public static int Fibonacci(int n){
     int a = 0,b=1,sum=0;
     for(int i=0;i<n-1;i++){
       sum=a+b;
       a=b;
       b=sum;
     }
     return sum;
    }
    
    
 public static int fib(int n)
{
    // Base cases
//    if (n == 0)
//        return 0;
//    if (n == 1 || n == 2)
//        return (f[n] = 1);
// 
//    // If fib(n) is already computed
//    if (f[n]!=0)
//        return f[n];
// 
//    int k = (n & 1)? (n+1)/2 : n/2;
// 
//    // Applyting above formula [Note value n&1 is 1
//    // if n is odd, else 0.
//    f[n] = (n & 1)? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
//           : (2*fib(k-1) + fib(k))*fib(k);
// 
//    return f[n];
//}
    return 0;
}
}
