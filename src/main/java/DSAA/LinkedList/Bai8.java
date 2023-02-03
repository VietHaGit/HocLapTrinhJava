package DSAA.LinkedList;
import java.util.*;
// tim kiem phan tu theo chi muc
public class Bai8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }
        System.out.print("Cac phan tu trong LinkedList La : " + list);

        int k = Sc.nextInt();
        System.out.print("phan tu tiem kiem duoc la: " + list.get(k));

    }
}
