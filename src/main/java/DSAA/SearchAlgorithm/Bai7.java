package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai7 {
    /*
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Sc.nextInt();
        for (int i = 0; i< n; i++){
            list.add(Sc.nextInt());
        }
        int x = Sc.nextInt();
        System.out.print(list.indexOf(x));
        Sc.close();
     */
//    UCLN
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int result = 1;
        for (int i = 1; i <= a && i <=b; i++){
            if (a % i ==0 && b% i==0){
                result = i;
            }
    }
        System.out.print(result);
    }
}
