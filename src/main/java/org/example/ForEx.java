package org.example;

import java.util.Scanner;

public class ForEx {

    //Sum
    /*
    public static int Sum(int n){
        int a = 0;
        for (int i = 0; i<=n;i++){
            a +=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(Sum(n));
    }
     */

    //Sum of elements divisible by 3 in array
    /*
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        int Sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] > 0) {
                Sum += arr[i];
            }
        }
        System.out.print(Sum);
     */

    //find prime number
    /*
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(SoNguyenTo(n));

    }
    public static boolean SoNguyenTo(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0 ){
                return false;
            }
        }
        return true;

    }
     */
    }

