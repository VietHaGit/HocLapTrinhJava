package DSAA.LinkedList;
import java.util.*;
public class Bai6 {
//    add phan tu vao linkedList
public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    int n = Sc.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for (int i =0; i < n; i++){
        list.add(Sc.nextInt());
    }

    System.out.println(list);
    int k =Sc.nextInt();
    int x = Sc.nextInt();
    list.add(k,x); // add theo chi so va gia tri
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()){
        System.out.print(iterator.next() + " ");
    }
}
}
