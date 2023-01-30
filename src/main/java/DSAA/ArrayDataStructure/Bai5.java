package DSAA.ArrayDataStructure;

import java.util.Scanner;

public class Bai5 {

    // phương thức kiểm tra một số có phải là 1 số nguyên tố hay không
    public static boolean IsPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(n); i++){
            if (n %i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[100];
        for (int i =0; i<n;i++){
            arr[i] = Sc.nextInt();
        }
// nếu không phải là số nguyên tố thì in ra màn hình
        for (int i = 0; i<n;i++){
            if (IsPrime(arr[i] ) == true){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
// Thanks