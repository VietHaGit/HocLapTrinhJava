package DSAA.LinkedList;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i =0; i <n;i++){
            list.add(Sc.nextInt());
        }

//        for (Integer item: list){
//            System.out.println("danh sach cua mang la: " + item);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
