package DSAA;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai8 {
    public  static void sort(int[] arr){
// sắp xếp tăng dần
        for (int i = 0 ; i < arr.length;i++){
            for (int j = i+1 ; j < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public  static void show(int[] arr){
        for (Integer a:arr ) {
            System.out.print(a + " ");
        }
    }
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr_a = new int[n];
        for (int i = 0 ; i < n;i++){
            arr_a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr_b = new int[m];
        for (int i = 0 ; i < m;i++){
            arr_b[i] = sc.nextInt();
        }
        int[] arr = new int[arr_a.length + arr_b.length];
        int pos = 0;// lưu số lượng phần tử của mảng arr
        for (Integer value : arr_a) { //sử dụng vòng lặp for để lưu các phần tử trong mảng arr_a vào mảng arr
            arr[pos] = value;
            pos++;
        }
        for (Integer value : arr_b) { //sử dụng vòng lặp for để lưu các phần tử trong mảng arr_b vào mảng arr
            arr[pos] = value;
            pos++;
        }
        sort(arr);
        show(arr);
    }
}
