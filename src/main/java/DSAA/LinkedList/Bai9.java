package DSAA.LinkedList;
import java.util.*;
public class Bai9 {
//    cap nha gia tri cho phan tu trong mang
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n ; i++){
            list.add(Sc.nextInt());
        }
        System.out.print(list);
        int  a = Sc.nextInt();
        int b = Sc.nextInt();
        for (int i = 0; i< list.size(); i++){
            if (a == list.get(i)){
                list.set(i,b);
            }
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
