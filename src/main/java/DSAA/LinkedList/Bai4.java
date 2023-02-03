package DSAA.LinkedList;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(150);
        linkedList.add(600);
//Lấy list con trong LinkedList
//        LinkedList subLinkedList = new LinkedList(linkedList.subList(1,3));
//        System.out.println(subLinkedList);

//subList kết hợp với sắp xếp
//        linkedList.sort(Comparator.comparingInt(o -> (int)o).reversed());

//        linkedList.sort((o1, o2) -> o2 - o1);
//        LinkedList subLinkedList = new LinkedList<>(linkedList.subList(0,3));
//        System.out.println(subLinkedList);

        linkedList.sort(Comparator.comparingInt(o -> o));
        System.out.println(linkedList);


    }
}
