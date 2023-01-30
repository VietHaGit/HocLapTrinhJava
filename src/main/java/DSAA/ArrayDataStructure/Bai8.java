package DSAA.ArrayDataStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    /*
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
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int teamp = arr[i];
                    arr[i] = arr[j];
                    teamp = arr[j];
                }
            }
        }
    }
    public static void show(int[] arr){
        for (Integer a: arr){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n ; i++){
            array1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for(int i = 0; i < m;i++){
            array2[i] = scanner.nextInt();
        }

       int[] arr = new int[array1.length+ array2.length];
        int pos = 0;
        for (Integer element: array1){
            arr[pos] = element;
            pos ++;
        }

        for (Integer element:array2){
            arr[pos] = element;
            pos++;
        }
        sort(arr);
       show(arr);
    }
}
