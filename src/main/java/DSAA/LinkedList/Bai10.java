package DSAA.LinkedList;
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            list.add(Sc.nextInt());
        }
        System.out.print(list);

        int k = Sc.nextInt();
        int size = list.size();
        int temp = list.get(k);
        for (int i =0;i < size ; i++) {
            if (list.get(i) > temp) {

                list.remove(i);
                // vi khi xoa thi i bi giam ma vong lap lai tang i
                // => se khong xet du cac gia tri
                i--;
                // Sau khi xoa phai giam kich thuoc List
                size--;
            }
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
