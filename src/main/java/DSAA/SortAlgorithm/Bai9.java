package DSAA.SortAlgorithm;
import java.util.*;
public class Bai9 {
    public static void quickSort(int[] arr , int l , int r){
        int p = arr[(l+r)/2];
        int i = l;
        int j = r;
        while (i<j){
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
        if (i < r){
            quickSort(arr,i,r);
    }
        if (l < j){
            quickSort(arr,l,j);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = Sc.nextInt();
        }
        quickSort(arr,0, n-1);
        int count = 1;
        for (int i = 1; i<n ;i ++){
            if (arr[i] == arr[i-1]){
                count++;
            }
            else {
                System.out.print(arr[i-1] + ":"+ count + ";");
                count = 1;
            }
        }
        System.out.print(arr[n-1]+":" + count+";");
    }
}
