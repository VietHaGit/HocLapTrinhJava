package DSAA.LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        //them cac person vao danh sach
        linkedList.add(new Person("a", "hcm", 19));
        linkedList.add(new Person("f", "hcm", 21));
        linkedList.add(new Person("k", "hcm", 23));
        linkedList.add(new Person("d", "hcm", 21));
        linkedList.add(new Person("s", "hcm", 20));
// sap xep tang dan theo ten
//        Collections.sort(linkedList ,(o1, o2) -> o1.getName().compareTo(o2.getName()));
//// duyet danh sach
//        linkedList.forEach(person -> System.out.println(person.toString()));

//        xuất ra danh sách các Person sắp xếp tăng dần theo name, nếu cùng name thì sắp xếp theo age.
//        linkedList.sort(Comparator.comparing(o -> ((Person)o).getName())
//                .thenComparing(o -> ((Person)o).getAge()));
//        linkedList.forEach(person -> System.out.println(person.toString()) );

//        linkedList.removeFirst();
//       linkedList.forEach(person -> System.out.println(person.toString()));

        linkedList.sort((o1, o2) -> o1.getAge()- o2.getAge());

        linkedList.forEach(person -> System.out.println(person.toString()));


    }
}
