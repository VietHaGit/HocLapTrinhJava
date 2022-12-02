package org.example;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        // Array in java

        /*
        // Declare array a of 10 integers
      int[] a = new int[10];
        // Use for loop to enter the values of elements in array
      for (int i = 0; i< 10;i++){
          a[i] = Sc.nextInt();
      }
        // Use for loop to display the entered values of elements in array
      for (int i = 0; i< 10;i++){
          System.out.print(a[i]+ " ");
      }
         */
        // prints the largest element in the array.
        //Input from the integer keyboard n
        /*
       int n = Sc.nextInt();
       //n is the number of elements in the array
       int[] array = new int[n];
       //Input data into array
       for (int i = 0; i<n;i++){
           array[i]= Sc.nextInt();
       }
        int Maxvalue = array[0];
       //traverse the element in the array to find the largest number
       for (int i = 1; i < n;i++){
           if(array[i] > Maxvalue){
               Maxvalue = array[i];
           }
       }
       System.out.print(Maxvalue);
         */

        //Min
        /*
        int[] arr = new int[5];
        for (int i = 0; i<5;i++ ){
            arr[i] = Sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i< 5;i++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.print(min);
         */

        //prints the sum of the first element and the last element in arr
        /*
        int n = Sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0 ; i< n; i ++){
            arr[i] = Sc.nextInt();
        }
        System.out.print(arr[0] + arr[n -1]);
         */

        //Prints all even numbers in arr.
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i ++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0; i < n ; i ++){
            if (arr[i] %2 ==0){
                System.out.print(arr[i]+ " ");
            }
        }
         */
        //prints the number of elements in arr
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i ++){
            arr[i] = Sc.nextInt();
        }
        int k = Sc.nextInt();
        int count = 0;
        for (int i = 0 ; i < n ; i ++){
            if( arr[i] == k){
                count++;
            }
        }
        System.out.print(count);
         */

        //prints the sum of all odd numbers which are greater than 0 in the array.
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i < n; i++){
            arr[i] = Sc.nextInt();
        }

        int Sole = 0;
        for (int i = 0 ; i < n ; i ++){
            if (arr[i] %2 !=0 && arr[i] > 0){
                Sole += arr[i];
            }
        }
        System.out.print(Sole);
         */

        //prints all numbers which are greater than or equal to 0 and less than or equal to 10 in arr.
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i < n; i++){
            arr[i] = Sc.nextInt();
        }

        for (int i = 0 ; i < n; i ++){
            if (arr[i]>=0 && arr[i]<= 10){
                System.out.print(arr[i]+ " ");
            }
        }
         */

        //sort array elements in ascending order
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0; i <n; i++){
            for (int j = i +1 ; j <n; j++){
                if(arr[i] > arr[j])// Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
                {
                int temp = arr[i];// Lưu trữ giá trị arr[i] mới
                arr[i] = arr[j];
                arr[j] = temp; // arr[i] = arr[j] nhờ biến trung gian .
                }
            }

        }
        for ( int i = 0 ; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
         */

        //Given a 2-dimensional
        /*
        int n = Sc.nextInt();
        int m = Sc.nextInt();
      int [][] arr = new int[n][m];

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j< m; j++) {
                arr[i][j] = Sc.nextInt();
            }
}
            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j< m; j++) {
                   answer += arr[i][j];
                }
            }
            System.out.print(answer);

         */

        //Write a program that accepts arr from the user and calculates the sum of numbers in arr, which are divisible by 5.
        /*
        int n = Sc.nextInt();
        int m = Sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0 ; i < n; i ++){
            for (int j = 0; j < n ; j++){
                arr[i][j] = Sc.nextInt();
            }
        }

        int aswer = 0;
        for (int i = 0 ; i < n; i ++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j] % 5 == 0){
                    aswer += arr[i][j];
                }
            }
        }
        System.out.print(aswer);

         */


    }
}