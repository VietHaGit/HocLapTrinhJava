package org.example;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args){
        Scanner Sc = new  Scanner(System.in);
        // Output the value of the array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
         */

        //Find the largest number in the array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        int Max = arr[0];
        for (int i = 0 ; i<n; i++){
            if (arr[i] >  arr[0]){
                Max = arr[i];
            }
        }
        System.out.print(Max);
         */


        //Find the smallest number in the array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        int Min = arr[0];
        for (int i = 0 ; i<n; i++){
            if (arr[i] < arr[0]){
                Min = arr[i];
            }
        }
        System.out.print(Min);
         */

        //Find even number in array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0 ; i < n ; i ++){
            if ( arr[i] %2 == 0){
                System.out.print(arr[i]);
            }
        }
         */

        //Find odd numbers in array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0 ; i < n ; i ++){
            if ( arr[i] %2 != 0){
                System.out.print(arr[i]);
            }
        }
         */

        //Sort ascending in array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0; i < n ; i++){
            for (int j = i +1; j <n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0 ; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
         */

        //Sort descending in array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n ; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
         */

        //sum of first and last element in array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
            System.out.print(arr[0]+arr[n-1]);
         */

        //The number of occurrences of the element in the array
        /*
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }

        int count = 0;
        int k = Sc.nextInt();
        for (int i = 0 ; i < n; i++){
            if (arr[i] == k){
                count ++;
            }
        }
        System.out.print(count);
         */

    }
}
