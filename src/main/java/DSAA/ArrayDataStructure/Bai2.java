package DSAA.ArrayDataStructure;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();  // Nhập n là một số nguyên dương ,
        int[] arr = new int[n];// n số nguyên là phần tử trong mảng
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i]; // giá trị bình phương của mỗi arr[i]
            System.out.println(arr[i] + ""); // in mảng mới ra màn hình
        }
    }
}
