package DSAA.SortAlgorithm;
import java.util.*;
public class Bai10 {
    public static void quickSort(int[] arr , int l, int r){
        int p = arr[(l+r)/2];
        int i = l;
        int j = r;
        while (i < j){
            while (arr[i] < p){
                i++;
            }
            while (arr[j] > p){
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
        if (i<r){
            quickSort(arr,i,r);
        }
        if (l < j){
            quickSort(arr,l,j);
        }
    }
    public static int result(int[] arr, int n , int k){
        int count = 0;
        for (int i = 1 ; i < n;i++){
            if (arr[i] - arr[i-1] > k){
                count ++;
            }
        }
        return count +1;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = Sc.nextInt();
        }
        int k = Sc.nextInt();
        quickSort(arr, 0, n-1);
        System.out.print(result(arr,n,k));
    }
}
