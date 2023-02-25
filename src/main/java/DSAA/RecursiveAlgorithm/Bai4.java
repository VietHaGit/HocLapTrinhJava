package DSAA.RecursiveAlgorithm;
import java.util.*;
public class Bai4 {
    public static long fibonacci(int n){
        if (n==1 || n ==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        System.out.print(fibonacci(n));
        Sc.close();
    }
}
