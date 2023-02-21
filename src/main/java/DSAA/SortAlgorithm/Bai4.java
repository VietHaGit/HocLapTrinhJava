package DSAA.SortAlgorithm;
import java.util.*;
//Merger Sort
public class Bai4 {
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr) {
//        sap xep tang dan
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        for (int i = middle + 1; i <= right; i++) {
            int curValue = arr[i];
            int j = i;
            while (j > left && arr[j - 1] > curValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = curValue;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSort(arr);
        printArr(arr);
        scanner.close();
    }
    }

