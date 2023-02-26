package DSAA.SomeConceptsAboutAlgorithms;
import java.util.*;
public class Bai2 {
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
public static int solve(int[] arr,int n) {
        int k = 1;
        quickSort(arr,0,n-1);
        int stiffness = arr[n-1];
        for (int i = n-2;i >=0;i--){
            k = k+1;
            stiffness = stiffness+1;
            if (stiffness > arr[i]){
                stiffness = arr[i];
            }
            if (stiffness==0) return k;
        }
        return n;
}

    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[100001];
        for (int i = 0; i < n ; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print(solve(arr,n));
    }
}
