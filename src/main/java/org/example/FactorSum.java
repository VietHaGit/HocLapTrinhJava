package org.example;

import java.util.Scanner;

public class FactorSum {
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i =2 ; i <Math.sqrt(n);++i)
            if (n%i==0) return false;
            return true;

    }
    public static int  solve(int n ){
        int Sum = 0;
        int k =2;
        while (n > 1){
            while (n % k == 0){
                Sum += k;
                n/=k;
            }
            k++;
        }
        return Sum;
    }
    public static int factoSum(int n){
        while (n!= solve(n));
        n =solve(n);
        return n;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        factoSum(n);

    }
}
