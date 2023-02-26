package DSAA.SomeConceptsAboutAlgorithms;
import java.util.*;
public class Bai1 {
    // Thuật toán tham lam
    public static void quickSort(int[] arr, int l , int r){
        int p = arr[(l+r)/2];
        int i = l;
        int j = r;
        while (i < j){
            while (arr[i]<p){
                i++;
            }
            while (arr[j] > p){
                j--;
            }
            if (i<=j){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r){
            quickSort(arr,i,r);
        }
        if (l<j){
            quickSort(arr,l,j);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = Sc.nextInt();
        }
        quickSort(arr,0,n-1);
        int k =1;
        int max = 0;
        for (int i = n -1; i >=0;i--){
            if (arr[i] + k >max){
                max =arr[i] +k;
            }
            k = k+1;
        }
        System.out.print(max);
    }
}
