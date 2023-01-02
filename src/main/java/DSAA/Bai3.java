package DSAA;

import java.util.Scanner;

public class Bai3 {
    // Chèn một phần tử vào mảng
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();  // Nhập n là một số nguyên dương ,
        int[] arr = new int[100];// n số nguyên là phần tử trong mảng
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int k = Sc.nextInt();
        int x = Sc.nextInt();
        for (int i = n; i >= k +1; i--){
            arr[i] = arr[i-1]; // để phần tử từ k -> n-1 sẽ tăng lên một
        }
        arr[k] =x;
        n++;
        for (int i = 0; i < n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
