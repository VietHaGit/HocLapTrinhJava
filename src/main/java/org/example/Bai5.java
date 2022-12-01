package org.example;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        //Loop in java

        //Enter from the integer keyboard n and display the numbers 1 to n
        /*
        int n = Sc.nextInt();
        for (int i = 1; i <=n;i++ ){
            System.out.print(i+ " ");
        }
         */
        //Print numbers from 10 to 1
        /*
        int n = Sc.nextInt();
        for (int i = n; i>=1;i--) {
            System.out.print(i + " ");
        }
         */

        //Print even numbers from 0 to 100
        /*
        int n = Sc.nextInt();
        for (int i = 0; i <= n; i +=2) {
            System.out.print(i+" ");
        }
         */

        //Print odd numbers from 0 to 100
        /*
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i +=2) {
            System.out.print(i+" ");
        }
         */

        //Display all numbers from a to b
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        for (int i = a; i <=b; i++){
            System.out.print(i+" ");
        }
         */

        //Displays all numbers from n to -n in descending order.
         /*
        int n = Sc.nextInt();
        for(int i = n; i >= -n;i--){
            System.out.print(i+" ");
        }
         */

        /*
        for (int i1 =-n;i1  <= n; i1 ++ ){
            System.out.print(i1+" ");
        }
         */

        //Displays the sum of all the numbers from a to b
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int Test = 0;
        for (int i = a; i <=b; i++){
            Test += i;// Test = Test+ i
        }
        System.out.print(Test+ " ");
         */

        //Displays the sum of all odd numbers from 0 to n
        /*
        int n = Sc.nextInt();
        int Test = 0;
        for(int i = 0; i <=n; i++){
            if(i %2!=0){
                Test+=i;
            }
        }
        System.out.print(Test+" ");
         */

        //Numbers divisible by 3 from a to b
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        for(int i = a; i <=b ; i++){
            if(i %3 == 0){
                System.out.print( i+" ");
            }
        }
         */

        //Displays the result of n!
        /*
        int n = Sc.nextInt();
        int Test = 1;
        for (int i = 1; i<=n;i++){
            Test *= i;
        }
        System.out.print(Test+ " ");
         */

        //Prints the divisors of n where n > 0.
        /*
        int n = Sc.nextInt();
        for (int i = 1; i<= n; i++){
            if(n%i ==0){
                System.out.print(i + " ");
            }
        }
         */

        //Repeat a loop many times
        /*
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
         */

        //Max
        int max = 0;
        for(int i = 1 ; i < 5; i ++){
            if (max < i){
                max = i;
            }
        }
        System.out.print(max );
    }
}
