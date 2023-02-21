package DSAA.SortAlgorithm;
import java.util.*;
public class Bai7 {
//    Quick Sort
    public static void quickSort(int[] arr , int l,int r ){
        int p = arr[(l+r)/2];
        int i = l;
        int j = r;
        while (i<j){
            while (arr[i] <p){
                i++;
            }
            while (arr[j] >p){
                j--;
            }
            if (i <=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i<r){
            quickSort(arr,i,r);
        }
        if (l<j){
            quickSort(arr,j,l);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
