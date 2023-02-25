package DSAA.RecursiveAlgorithm;
import java.util.*;
public class Bai2 {
    public static long dequy(int a , int b){
        if (b==0){
            return 1;
        }
//        a^b = a * a^b-1
        return a * dequy(a,b-1);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.print(dequy(a,b));
        Sc.close();
    }
}
