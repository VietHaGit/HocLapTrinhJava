package DSAA.ArrayDataStructure;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100001];
        int[] b = new int[100001]; //b[i] sẽ lưu số lần xuất hiện của số có giá trị là i.
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int Max = a[0];
        for (int i = 0; i <n;i++){
            if (a[i] > Max){
                Max = a[i];
            }
        }
        for (int i = 0; i<= Max ;i++){
            b[i] = 0;
        }
        for (int i =0; i < n; i++){
            b[a[i]] += 1;//nếu trong dãy có số a[i] thì ta tằng b[a[i]] lên 1 đơn vị, giá trị của a[i] sẽ được xem là một chỉ số trong dãy b).
        }
        for (int i = 0; i<= Max;i++){
            if (b[i]>0){
                System.out.print(i + "-" + b[i] +";");
            }
        }
    }
}
