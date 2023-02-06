package DSAA.SearchAlgorithm;
import java.util.*;
public class Bai7 {
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
    }
}
