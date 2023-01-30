package DSAA.ArrayDataStructure;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int m = Sc.nextInt();
        int n = Sc.nextInt();
        int a[][]= new int[m][n];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = Sc.nextInt();
            }
        }
        int Sum=0;
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                Sum += a[i][j];
            }
        }
        System.out.print(Sum + "");
        }
}
