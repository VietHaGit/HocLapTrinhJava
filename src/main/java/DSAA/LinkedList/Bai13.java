package DSAA.LinkedList;
import java.util.*;
public class Bai13 {
//    gép 2 mảng trong LinkedList
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }

        System.out.print(list);
        int k = Sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = k ; i < n; i++ ){
            list1.add(list.get(i));
        }
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i< k; i++){
            list2.add(list.get(i));
        }

        list1.addAll(list2);
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
