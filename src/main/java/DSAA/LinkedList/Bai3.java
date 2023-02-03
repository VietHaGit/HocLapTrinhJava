package DSAA.LinkedList;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(null);
        linkedList.add(150);
        linkedList.add(600);

        Collections.sort(linkedList, Comparator.nullsFirst(Comparator.comparingInt(o -> o)));
        linkedList.forEach(e -> System.out.print(e + " "));

        Collections.sort(linkedList, Comparator.nullsLast(Comparator.comparingInt(o -> o)));
        linkedList.forEach(e -> System.out.print(e + " "));

    }
}
