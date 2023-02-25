package DSAA.RecursiveAlgorithm;
import java.util.*;
public class Bai5 {
    public static long gameGuessNumber(int n){
            if (n==1){
                return 1;
            }
            return 1 + gameGuessNumber(n-(n+1)/2);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.print(n);
        Sc.close();
    }
}
