package DSAA.LinkedList;
import java.util.*;
public class Bai7 {
//    xoa phan tu dua vao chi muc
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i =0; i<n;i++){
            list.add(Sc.nextInt());
        }
        System.out.println(list);
        int k = Sc.nextInt();
        list.remove(k);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
