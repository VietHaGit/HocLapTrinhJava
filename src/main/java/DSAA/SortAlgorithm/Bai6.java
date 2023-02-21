package DSAA.SortAlgorithm;
import java.util.*;
public class Bai6 {
//    ShellSort
    public static void shellSort(int[] arr , int n){
        int interval, i, j, temp;
        for (interval = n/2;interval > 0; interval /=2){
            for (i = interval; i<n;i++){
                temp = arr[i];
                for (j = i;j >=interval &&arr[j -interval] > temp; j-= interval){
                    arr[j] = arr[j-interval];
                }
                arr[j]  = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shellSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
