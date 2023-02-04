package DSAA.LinkedList;
import java.util.*;
public class Bai12 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i =0; i < n; i++){
            list.add(Sc.nextInt());
        }
        System.out.print(list);

        int K = Sc.nextInt();
        int X = Sc.nextInt();
        list.add(K,X);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
