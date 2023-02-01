package DSAA.ArrayList;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(9);

        System.out.println("Cac phan tu  cua mang la: " + arrayList);
/*
        //Sap xe tang dan va giam dan bang method sort trong ArrayList
        arrayList.sort((o1, o2) -> o1 - o2);
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);
        arrayList.sort((o1, o2) -> o2 - o1);
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);

        //Method sort trong ArrayList kết hợp Comparator
        arrayList.sort(Comparator.comparingInt(o -> o));// tang dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);
        arrayList.sort(Comparator.comparingInt(o ->(int) o).reversed());//giam dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);

        //Method sort trong collections
        Collections.sort(arrayList, (o1, o2) -> o1.compareTo(o2));//tang dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);
        Collections.sort(arrayList, (o1, o2) -> o2.compareTo(o1));//giam dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);

        //Method sort trong collection kết hợp với comparator
        Collections.sort(arrayList, Comparator.comparing(o-> o));//tang dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);
        Collections.sort(arrayList, Comparator.reverseOrder());//giam dan
        System.out.println("cac phan tu sau khi sap xep: " + arrayList);
 */
        // Lấy ra giá trị cuả phần tử có chỉ số index
        System.out.println("phan tu duoc lay ra la: " + arrayList.get(1));
        //lấy ra chỉ số index của phần tử cuối cùng trong mảng
        System.out.println(" phan tu cuoi cung cua mang la: " + arrayList.lastIndexOf(9));

        //trả về chỉ mục index của phần tử trong arrayList dựa vào giá trị tương ứng
        System.out.println("Chi muc cua phan tu la: " + arrayList.indexOf(4));

        //Thay đổi giá trị phần tử trong arraylist tại vị trí index
        arrayList.set(1, 4);
        System.out.println(" phan tu cua mang sau khi thay doi: " + arrayList);

    }

}
