package org.example;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        // If and Else in java
        /*
        int n = Sc.nextInt();
        //check odd or even number
        if(n % 2 == 0){
            System.out.println("n is an even number");
        }
        if(n % 2 != 0){
            System.out.println("n is an odd number");
        }
         */
        /*
        else {
            System.out.println("n is an odd number");
        }
         */

        //Check if a number is positive or negative
        /*
        if(n > 0){
            System.out.println("n is a positive number");
        }
        if(n < 0){
            System.out.println("n is a negative number");
        }
        if (n == 0){
            System.out.println("n is equal to 0");
        }
         */

        /*
        if( n ==0){
        System.out.println("n is equal to 0");
        }
        else if(n>0){
        System.out.println("n is a positive number");
        }
        else {
         System.out.println("n is a negative number");
         }
         */

        //Compare two numbers entered from the keyboard
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        if (a >= b){
            System.out.println("a is greater than or equal to b");
        }
        else if(a <= b){
            System.out.println("a is smaller than b");
        }
         */

        //string type comparison
        /*
        String Thanh = Sc.nextLine();
        String Ha = Sc.nextLine();
        if (Thanh.equals(Ha)){
            System.out.println("two people have the same name");
        }
        else {
            System.out.println("two people don't have the same name");
        }
         */

        //checks whether both a1 and b1 are not equal to zero or not.
        /*
        int a1 = Sc.nextInt();
        int b1 = Sc.nextInt();
        if(a1 != 0 && b1 !=0){
            System.out.println("a is not equal to 0 and b is not equal to 0");
        }
        else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
         */


        //Find the largest of three numbers
        /*
        int a2 = Sc.nextInt();
        int b2 = Sc.nextInt();
        int c2 = Sc.nextInt();
        if(a2 >= b2 && a2 >=c2){
            System.out.println(a2);
        } else if (b2 >= c2) {
            System.out.println(b2);
        }
        else {
            System.out.println(c2);
        }
         */

        //checks whether a3 is in the range [10, 100] or not.
        /*
        int a3 = Sc.nextInt();
        if(a3 >=10 && a3 <=100){
            System.out.println( a3+ "is in the range [10, 100]");
        }
        else {
            System.out.println( a3+ "is not in the range [10, 100]");
        }
         */

        //checks whether score is in the range [0, 10] or not.
        /*
        int score = Sc.nextInt();
        if(score < 0 || score > 10){
            System.out.println("The score is not valid");
        }
        else {
            System.out.println("The score is valid");
        }
         */


        //checks if a, b, and c (in this order) can form an increasing or decreasing sequence of numbers.
        /*
        int a4 = Sc.nextInt();
        int b4 = Sc.nextInt();
        int c4 = Sc.nextInt();
        if(a4 <=b4 && b4 <=c4){
            System.out.println("increasing");
        } else if (a4 >= b4 && b4 >= c4) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("neither increasing nor decreasing order");
        }
         */

        //Determine in which quadrant the point (x, y) lies.
        int x = Sc.nextInt();
        int y = Sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("This point lies in the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("This point lies in the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("This point lies in the Third quadrant");
        }
        else {
            System.out.println("This point lies in the Fourth quadrant");
        }
    }
}
