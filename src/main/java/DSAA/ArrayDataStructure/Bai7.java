package DSAA.ArrayDataStructure;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        boolean Check1 = true; // dãy số tăng dần
        boolean Check2 = true;// dãy số giảm dần
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                Check1 = false;
            }
            if (a[i] >= a[i - 1]) {
                Check2 = false;
            }
        }
        if (Check1 || Check2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}

