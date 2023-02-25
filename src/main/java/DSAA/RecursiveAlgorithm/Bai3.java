package DSAA.RecursiveAlgorithm;
import java.util.*;
public class Bai3 {
    public static long ucln(int a , int b){
        if (b==0){
            return a;
        }
        if (a % b==0){
            return b;
        }
        return ucln(b,a%b);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.print(ucln(a,b));
        Sc.close();
    }
}
