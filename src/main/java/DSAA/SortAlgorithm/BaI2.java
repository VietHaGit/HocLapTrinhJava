package DSAA.SortAlgorithm;

import java.util.Scanner;

//insertion sort
public class BaI2 {
    public static void insertionSort(int a[] , int n){
//        sap xep tang  dan voi dieu kien a[i-1] > a[i]
//        sap xep giam dan voi dieu kien a[i-1] < a[i]
        int index,value;
        for (int i = 1; i < n;i++) {
           index = i;
            value = a[i];
            while (index > 0 && a[index-1] >   value){
                a[index] = a[index -1];
                index--;
            }
            a[index] = value;
        }
    }
    public static void printArray(int a[] , int n){
        for (int i = 0; i<n;i++){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a[] = new int[100001];
        for (int i = 0; i<n; i++){
            a[i] =Sc.nextInt();
        }
        insertionSort(a,n);
        printArray(a,n);
    }
}
