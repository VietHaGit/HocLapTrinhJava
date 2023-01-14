package DSAA;

import java.util.Scanner;
//Array data structure
public class Bai1 {
   public static void main(String[] args){
       Scanner Sc = new Scanner(System.in);
       int n = Sc.nextInt();  // Nhập n là một số nguyên dương ,
       int[] arr = new  int[n];// n số nguyên là phần tử trong mảng
       for (int i = 0; i < n;i++){
           arr[i] = Sc.nextInt();
       }
// Tính tổng các phần tử trong mảng
       int Sum = 0;
       for (int i = 0; i < n; i++){
           Sum += arr[i];
       }
       System.out.println(Sum);
   }
}
