package DSAA.SortAlgorithm;
import java.util.*;
import java.util.Scanner;

public class Bai8 {
//    Sap xep mang tang dan voi quickSort
    public static void quickSort(int[] arr , int l , int r){
        int P = arr[(l + r)/2];
        int i = l;
        int j = r;
        while (i < j){
            while (arr[i] < P){
                i++;
            }
            while (arr[j] > P){
                j--;
            }
            if (i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r){
            quickSort(arr ,i,r);
        }
        if(l < j){
            quickSort(arr, l,j);
        }
    }
//   tim ra so be nhat chua xuat hien trong mang
    public static int solve(int[] arr, int n){
        quickSort(arr , 0, n-1);
        if (arr[0] > 0){ // cac phan tu lon hon 0 , tu 1 tro len , thi so be nhat la so 0
            return 0;
        }
        for (int i = 1;i < n; i++){
            if (arr[i] - arr[i-1] > 1 ){
                return arr[i-1] + 1; // duyet mang de tim phan tu nho nhat CHUA xuat hien
            }
        }
        return arr[n-1] +1;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print(solve(arr,n));
    }
}
