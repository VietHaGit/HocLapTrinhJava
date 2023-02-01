package DSAA.ArrayList;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        /*
        ArrayList<String> arrayList = new ArrayList<String>();

        boolean result = arrayList.isEmpty();

        System.out.println("Kiểm tra mảng: \n " + result);

        System.out.println("Phan tu co trong mang la: \n" + arrayList);


        //add phan tu vao mang
        arrayList.add("Ha");
        arrayList.add("Thanh");
        arrayList.add("Quy");
        arrayList.add("Viet");
        boolean result2 = arrayList.isEmpty();
        System.out.println("ArrayList sau khi them phan tu rong hay khong? \n" + result2);

        System.out.println("Phan tu co trong mang sau khi thi them: \n"+ arrayList);
        // duyet cac phan tu bang vong lap for

        for (String item: arrayList){
            System.out.println(item);
        }

        //Duyệt các phần tử trong ArrayList thông qua đối tượng Iterator
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(14);
        arrayList.add(7);
        /*
        boolean check = arrayList.isEmpty();
        System.out.println("Kiem tra mang:" + check);
         */
        System.out.println("\n Phan tu co trong Arraylist la: \n" + arrayList);
        /*
        // duyet mang bang vong lap for
        for (Integer item: arrayList){
            System.out.println(item);
        }
        // duyet bang Interator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

         */
        //Sap xep mang tang dan
        Collections.sort(arrayList);
        for (Integer item: arrayList){
            System.out.println(item);
        }

        System.out.println("phan tu trong mang sau khi sap xep la: " + arrayList);
        // sap xem mang giam dan
        Collections.sort(arrayList, ((o1, o2) ->o2.compareTo(o1)));
        System.out.println("phan tu trong mang sau khi sap xep la: " + arrayList);

    }
}
