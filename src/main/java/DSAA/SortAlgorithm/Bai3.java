package DSAA.SortAlgorithm;

import java.util.Scanner;

// SelectionSort
public class Bai3 {
//    sap xep tang dan bang selection sort vs dieu kien a[i] > a[i+1] ket hop hoan vi
//    sap xep giam dan bang selection sort vs dieu kien a[i] < a[i+1] ket hop hoan vi
    public static void selectionSort(int a[] , int n){
        int indexMin;
        for (int i = 0; i <n-1; i++){
            indexMin = i;
            for (int j = i +1; j <n;j++){
                if (a[indexMin] >a[j]){
                    indexMin = j;
                }
            }
             if (i != indexMin){
                 int temp = a[i];
                 a[i] = a[indexMin];
                 a[indexMin] = temp;
             }

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
        for (int i = 0; i <n;i++){
            a[i] = Sc.nextInt();
        }
        selectionSort(a,n);
        printArray(a,n);
    }
}
