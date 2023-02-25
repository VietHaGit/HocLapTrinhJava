package DSAA.RecursiveAlgorithm;
import java.util.*;
public class Bai1 {
    public static long factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.print(factorial(n));
        Sc.close();
    }
}
