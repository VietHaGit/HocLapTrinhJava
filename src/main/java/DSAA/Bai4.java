package DSAA;

import java.util.Scanner;
// Xóa phần tử trong mảng
public class Bai4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();  // Nhập n là một số nguyên dương ,
        int[] arr = new int[100];// n số nguyên là phần tử trong mảng
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int k = Sc.nextInt();
        for (int i = k ; i <n ; i++){
            arr[i] = arr[i+1];  // các phần tử từ chỉ số k đến n-1 sẽ giảm chỉ số đi 1 đơn vị
        }
        n--;
        for (int i = 0;i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
