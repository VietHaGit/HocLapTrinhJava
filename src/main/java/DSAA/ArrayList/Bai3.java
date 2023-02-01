package DSAA.ArrayList;
import java.util.*;
//xoa phan tu trong Arraylist
public class Bai3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ha");
        arrayList.add("Thanh");
        arrayList.add("Hoa");
        arrayList.add("Quy");
        arrayList.add("Viet");

        System.out.println("Cac phan tu trong mang la: " + arrayList);

        // dung remove() de xoa phan tu trong mang
        arrayList.remove("Ha");
        arrayList.remove("Thanh");
        arrayList.remove("Hoa");
        System.out.println("Cac phan tu con lai sau khi xoa: " + arrayList);
    }
}
